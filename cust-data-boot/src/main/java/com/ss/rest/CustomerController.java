package com.ss.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.entity.Customer;
import com.ss.service.CustomerService;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
//	Customer c = new Customer(1, "Shantanu", "Hingoli");
//	
//	@GetMapping(value = "/save", produces = "application/json")
//	public String savePerson() {
//		//TODO: process POST request
//		service.save(c);
//		return "Customer saved.";
//	}
	
	@GetMapping(value = "/fetch/{id}")
	public Customer getEmployee(@PathVariable int id)
	{
		Customer c = service.fetch(id);
		return c;
	
	}
	
	@PostMapping(value = "/save", consumes = "application/json")
	public String saveCustomer(@RequestBody Customer c) {
		//TODO: process POST request
		service.save(c);
		return "Customer saved.";
	}
	
	@GetMapping(value = "/list")
	public List<Customer> Employee(){
		return service.list();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deletebyid(@PathVariable int id) {
		 service.remove(id);
		 return "Deleted sucessfully";
	}
	
}
