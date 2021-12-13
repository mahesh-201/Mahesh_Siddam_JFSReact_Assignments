package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MainRepository extends MongoRepository<Employee, Integer>{  


}

