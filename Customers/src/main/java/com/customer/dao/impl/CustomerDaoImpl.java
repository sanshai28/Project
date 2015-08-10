package com.customer.dao.impl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.dao.CustomerDao;
import com.customer.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void saveCustomer(Customer customer) {
		getSession().merge(customer);
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> listAllCustomers() {
		return getSession().createCriteria(Customer.class).list();
		// TODO Auto-generated method stub
		
	}

	public void deleteCustomer(int customerId) {
		Customer customer=getCustomer(customerId);
		if(customer != null){
			getSession().delete(customer);
		}
		// TODO Auto-generated method stub
		
	}
	
	
	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Customer getCustomer(int customerId) {
		
		
		// TODO Auto-generated method stub
		return (Customer)getSession().get(Customer.class, customerId);
	}

}
