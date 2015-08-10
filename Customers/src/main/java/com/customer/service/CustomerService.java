package com.customer.service;

import java.util.List;

import com.customer.model.Customer;

public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	
	public List<Customer> listAllCustomers();
	
	public Customer getCustomer(int customerId);
	
	public void deleteCustomer(int customerId);

}
