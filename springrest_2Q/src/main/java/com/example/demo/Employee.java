package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="Employee")
@Data
public class Employee {
		@Id
		private int employeeID;
		
		private String employeeName;
		private String employeeDepartment;
		private String employeeDesignation;
		private float employeeSalary;
		
		public Employee() {}
		
		public Employee(int employeeID, String employeeName, String employeeDepartment, String employeeDesignation,
				float employeeSalary) {
			super();
			this.employeeID = employeeID;
			this.employeeName = employeeName;
			this.employeeDepartment = employeeDepartment;
			this.employeeDesignation = employeeDesignation;
			this.employeeSalary = employeeSalary;
		}
		@Override
		public String toString() {
			return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeDepartment="
					+ employeeDepartment + ", employeeDesignation=" + employeeDesignation + ", employeeSalary="
					+ employeeSalary + "]";
		}
		public int getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeeDepartment() {
			return employeeDepartment;
		}
		public void setEmployeeDepartment(String employeeDepartment) {
			this.employeeDepartment = employeeDepartment;
		}
		public String getEmployeeDesignation() {
			return employeeDesignation;
		}
		public void setEmployeeDesignation(String employeeDesignation) {
			this.employeeDesignation = employeeDesignation;
		}
		public float getEmployeeSalary() {
			return employeeSalary;
		}
		public void setEmployeeSalary(float employeeSalary) {
			this.employeeSalary = employeeSalary;
		}
		
		
	}

