package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.CustomerRepository;
import com.ss.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public void save(Customer c) {
		// TODO Auto-generated method stub
		repo.save(c);

	}

	@Override
	public Customer fetch(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
