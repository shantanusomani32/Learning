package com.ss;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
