package com.customer.dao;

import java.util.List;




import com.customer.model.Customer;


public interface CustomerDao {

	public void saveCustomer(Customer customer);
	
	public List<Customer> listAllCustomers();
	
	public Customer getCustomer(int customerId);
	
	public void deleteCustomer(int customerId);
}
