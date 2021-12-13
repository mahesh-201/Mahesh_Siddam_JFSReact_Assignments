package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Order")
@Data
public class OrderModel {
		@Id
		private int id;
		private String customername;
		private String customerCity;
		private double customerBill;
		
		
		public OrderModel(int id, String customername, String customerCity, double customerBill) {
			super();
			this.id = id;
			this.customername = customername;
			this.customerCity = customerCity;
			this.customerBill = customerBill;
		}
		@Override
		public String toString() {
			return "OrderModel [id=" + id + ", customername=" + customername + ", customerCity=" + customerCity
					+ ", customerBill=" + customerBill + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCustomername() {
			return customername;
		}
		public void setCustomername(String customername) {
			this.customername = customername;
		}
		public String getCustomerCity() {
			return customerCity;
		}
		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}
		public double getCustomerBill() {
			return customerBill;
		}
		public void setCustomerBill(double customerBill) {
			this.customerBill = customerBill;
		}
		
	}


