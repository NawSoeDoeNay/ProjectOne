package com.startup.demo.model.master.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.startup.demo.model.master.entity.ProductStockHistory.Action;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class ProductStockHistoryPK implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	@Column(name = "issue_at")
	private LocalDate issueAt;
	
	@Column(name = "seq_number")
	private int seqNumber;
	
	@Column(name = "product_id")
	private int productId;
	
	private Action action;
	
	public void setStockAction(ProductStockAction stockAction) {
		this.issueAt = stockAction.getIssueAt();
		this.seqNumber = stockAction.getSeqNumber();
	}
	
	public String getCode() {
		//yyyymmdd-001
		return "%s-%03d".formatted(issueAt.format(DF), seqNumber);
	}
	

}
