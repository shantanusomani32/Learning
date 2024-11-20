package com.ss.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cust")
public class Customer {
	@Id
	@Column(name = "cust_id")
	private int custId ;
	@Column(name= "cust_name" ,length = 30)
	private String custName;
	@Column(name = "city_name" , length = 15)
	private String city;
	
	public Customer(){}

	public Customer(int custId, String custName, String city) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
