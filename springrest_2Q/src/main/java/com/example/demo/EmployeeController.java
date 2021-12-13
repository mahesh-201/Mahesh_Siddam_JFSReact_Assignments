package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.MainRepository;

@RestController
public class EmployeeController {
		@Autowired
		private MainRepository mainRepository;
		
		@PostMapping("/saveEmployee")
		public String save(@RequestBody Employee employee) {
			mainRepository.save(employee);
			return "Added Employee with id: "+employee.getEmployeeID();
		}
		@GetMapping("/findAllEmployee")
		public List<Employee> getAll(){
			return mainRepository.findAll();
		}
		
		@GetMapping("/findAllEmployee/{id}")
		public Optional<Employee> getEmployee(@PathVariable int id){
			return mainRepository.findById(id);
		}
		
		@DeleteMapping("/delete/{id}")
		public String deleteEmployee(@PathVariable int id) {
			 mainRepository.deleteById(id);
			 return "Delete Employee with id: "+id;
		}
		
		@PutMapping("/update/{id}")
		public String updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
			mainRepository.findById(id);
			mainRepository.save(employee);
			return "Update Employee with id: "+id;
			
		}
	}

