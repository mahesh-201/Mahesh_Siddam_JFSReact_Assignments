package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.OrderModel;

public interface OrderRepository extends MongoRepository<OrderModel, Integer> {

}
