package com.startup.demo.model.transaction.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.util.StringUtils;

import com.startup.demo.model.master.entity.ProductStockAction;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SalePK implements Serializable, ProductStockAction{

	private static final long serialVersionUID = 1L;
	private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyyMMdd");

	@Column(name = "issue_at")
	private LocalDate issueAt;
	
	@Column(name = "seq_number")
	private int seqNumber;
	
	public String getCode() {
		return "%s-%03d".formatted(issueAt.format(DF),seqNumber);
	}
	
	public static SalePK parse(String code) {
		if(StringUtils.hasLength(code)) {
			var array = code.split("-");
			return new SalePK(LocalDate.parse(array[0],DF),Integer.parseInt(array[1]));
		}
		return null;
	}
}
