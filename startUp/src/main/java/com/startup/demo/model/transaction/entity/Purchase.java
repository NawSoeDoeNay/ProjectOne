package com.startup.demo.model.transaction.entity;

import java.util.List;

import com.startup.demo.model.AbstractEntity;
import com.startup.demo.model.account.entity.Supplier;
import com.startup.demo.model.master.entity.Product;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Purchase extends AbstractEntity{
	
	@EmbeddedId
	private PurchasePK id;
	
	@ManyToOne(optional = false)
	private Supplier supplier;
	
	@OneToMany(mappedBy = "purchase")
	private List<Product> products;
	
	private Status status;
	private String remark;
	
	public enum Status{
		Initiate, Success, Error
	}

}
