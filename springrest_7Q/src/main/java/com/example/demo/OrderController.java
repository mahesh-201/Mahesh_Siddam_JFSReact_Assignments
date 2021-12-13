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

import com.example.demo.OrderModel;
import com.example.demo.OrderRepository;

@RestController
public class OrderController {
		@Autowired
		private OrderRepository mainRepository;
		
		@PostMapping("/saveOrder")
		public String save(@RequestBody OrderModel order) {
			mainRepository.save(order);
			return "Added Employee with id: "+order.getId();
		}
		
		@GetMapping("/findAllOrder")
		public Iterable<OrderModel> getAll(){
			return mainRepository.findAll();
		}
		
		@GetMapping("/findAllOrder/{id}")
		public Optional<OrderModel> getOrder(@PathVariable int id){
			return mainRepository.findById(id);
		}
		
		
		@DeleteMapping("/delete/{id}")
		public String deleteOrder(@PathVariable int id) {
			 mainRepository.deleteById(id);
			 return "Delete Order with id: "+id;
		}
		
		
		@PutMapping("/update/{id}")
		public String updateOrder(@RequestBody OrderModel order, @PathVariable int id) {
			mainRepository.findById(id);
			mainRepository.save(order);
			return "Update Order with id: "+id;
			
		}
	}


