package com.ss.service;

import java.util.List;

import com.ss.entity.Customer;

public interface CustomerService {
	public void save(Customer c);
	public Customer fetch(int id);
	public List<Customer> list();
	public void remove(int id);
}
