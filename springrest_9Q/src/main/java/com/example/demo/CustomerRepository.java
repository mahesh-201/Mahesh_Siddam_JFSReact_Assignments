package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	

}
