package com.startup.demo.model.transaction.entity;

import com.startup.demo.model.master.entity.ProductStockHistory;
import com.startup.demo.model.master.entity.ProductStockHistoryPK;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class SaleProduct extends ProductStockHistory{
	
	public SaleProduct() {
		var pk = new ProductStockHistoryPK();
		pk.setAction(Action.Sell);
		setId(pk);
	}
	
	@ManyToOne(optional = false)
	private Sale sale;
	
	private int salePrice;

}
