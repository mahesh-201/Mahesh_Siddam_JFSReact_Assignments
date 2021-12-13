package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Customer;
import com.example.demo.CustomerRepository;

@RestController
public class CustomerController {
		@Autowired
		private CustomerRepository mainRepository;
		
		@PostMapping("/savecustomer")
		public String save(@RequestBody Customer customer) {
			mainRepository.save(customer);
			return "Added customer with id: "+customer.getCustomerID();
		}
		
		@GetMapping("/findAllcustomer")
		public Iterable<Customer> getAll(){
			return mainRepository.findAll();
		}
		
		@GetMapping("/findAllCustomer/{id}")
		public Optional<Customer> getOrder(@PathVariable int id){
			return mainRepository.findById(id);
		}
		
		@DeleteMapping("/delete/{id}")
		public String deleteOrder(@PathVariable int id) {
			 mainRepository.deleteById(id);
			 return "Delete customer with id: "+id;
		}
		
		@PutMapping("/update/{id}")
		public String updateOrder(@RequestBody Customer order, @PathVariable int id) {
			mainRepository.findById(id);
			mainRepository.save(order);
			return "Update customer with id: "+id;
			
		}
	}


