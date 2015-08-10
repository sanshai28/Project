package com.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	private int customerId;
	private String customerCode;	
	private String customerName;
	private String phoneNo;
	private String department;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCustomerId() {
		return customerId;
	}
	
	
	
	
	@Column(nullable = false)
	public String getCustomerCode() {
		return customerCode;
	}
	
	
	
	@Column(nullable = false)
	public String getCustomerName() {
		return customerName;
	}
	
	
	
	@Column(nullable = false)
	public String getPhoneNo() {
		return phoneNo;
	}
	
	
	
	@Column(nullable = false)
	public String getDepartment() {
		return department;
	}
	
	
	
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	


}
