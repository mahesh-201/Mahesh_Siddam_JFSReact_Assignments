package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection="Customer")
@Data
public class Customer {
		@Id
		private int customerID;
		
		private String customerName;
		private String customerCityt;
		private String customerCountry;
		
		public Customer() {	}

		
		public Customer(int customerID, String customerName, String customerCityt, String customerCountry) {
			super();
			this.customerID = customerID;
			this.customerName = customerName;
			this.customerCityt = customerCityt;
			this.customerCountry = customerCountry;
		}


		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerCityt() {
			return customerCityt;
		}

		public void setCustomerCityt(String customerCityt) {
			this.customerCityt = customerCityt;
		}

		public String getCustomerCountry() {
			return customerCountry;
		}

		public void setCustomerCountry(String customerCountry) {
			this.customerCountry = customerCountry;
		}
		

	}


