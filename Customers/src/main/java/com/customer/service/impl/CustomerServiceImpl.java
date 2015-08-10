package com.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.dao.CustomerDao;
import com.customer.model.Customer;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}
	
	@Transactional(readOnly = true)
	public List<Customer> listAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.listAllCustomers();
	}
	
	@Transactional(readOnly = true)
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(customerId);
	}
	@Transactional
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(customerId);
	}

	
}
