package com.startup.demo.model.transaction.entity;

import com.startup.demo.model.master.entity.ProductStockHistory;
import com.startup.demo.model.master.entity.ProductStockHistoryPK;
import jakarta.persistence.ManyToOne;

public class CancelProduct extends ProductStockHistory{

	public CancelProduct() {
		var pk = new ProductStockHistoryPK();
		pk.setAction(Action.Cancel);
		setId(pk);
	}
	
	@ManyToOne
	private Cancel cancel;
}
