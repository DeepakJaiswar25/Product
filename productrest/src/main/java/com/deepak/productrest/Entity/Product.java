package com.deepak.productrest.Entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String type;
	private String place;
	private int warranty;
}
