package com.startup.demo.model.transaction.entity;

import java.time.LocalDateTime;

import com.startup.demo.model.AbstractEntity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Cancel extends AbstractEntity{
	
	@EmbeddedId
	private CancelPk id;
	
	private LocalDateTime cancelledAt;
	private String cancelledBy;

}
