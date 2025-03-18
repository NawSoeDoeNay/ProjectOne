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
public class PurchaseProduct extends ProductStockHistory{
	
	public PurchaseProduct () {
		var pk = new ProductStockHistoryPK();
		pk.setAction(Action.Buy);
		setId(pk);
	}

	@ManyToOne
	private Purchase purchase;
	
	private int buyPrice;
	private int sellPrice;
	
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
		getId().setStockAction(purchase.getId());
	}
}
