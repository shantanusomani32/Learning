package com.ss.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int code;
	
	@Column(name = "pname", length = 30)
	private String name;
	
	private double price;
	
	@Column(length = 30)
	private String category;
	
	public Product()
	{
		
	}

	public Product(int code, String name, double price, String category) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
}
