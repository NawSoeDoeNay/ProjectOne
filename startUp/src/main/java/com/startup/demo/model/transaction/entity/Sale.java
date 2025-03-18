package com.startup.demo.model.transaction.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.startup.demo.model.AbstractEntity;
import com.startup.demo.model.account.entity.Address;
import com.startup.demo.model.account.entity.Customer;
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
public class Sale extends AbstractEntity{
	
	@EmbeddedId
	private SalePK id; 
	
	@ManyToOne(optional = false)
	private Customer customer;
	
	@ManyToOne(optional = false)
	private Address address;
	
	private LocalDateTime saleAt;
	private Status status;
	private LocalDateTime statusChangeAt;
	private int delivery;
	private String remark;
	
	@OneToMany(mappedBy = "sale")
	private List<Product> products;
	
	
	public enum Status {
		Invoiced, Delivered, Cancel
	}

}
