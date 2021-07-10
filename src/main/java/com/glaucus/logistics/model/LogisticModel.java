package com.glaucus.logistics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "number")
public class LogisticModel {
	@Id
	@Column(name = "id")
	private Integer id = 0;

	@Column(name = "index_counter")
	private Integer indexCounter;
}
