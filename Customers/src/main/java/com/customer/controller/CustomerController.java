package com.customer.controller;



import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = { "/", "/listCustomer" })
	public String listBooks(Map<String, Object> map) {

		map.put("customer", new Customer());
		map.put("customerList", customerService.listAllCustomers());

		return "/customer/listCustomer";
	}

	
	
	@RequestMapping("/get/{customerId}")
	public String getCustomer(@PathVariable int customerId, Map<String, Object> map) {

		Customer customer = customerService.getCustomer(customerId);

		map.put("customer", customer);

		return "/customer/customerForm";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer,
			BindingResult result) {

		customerService.saveCustomer(customer);

		return "redirect:listCustomer";
	}
	
	@RequestMapping("/delete/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") int customerId) {

		customerService.deleteCustomer(customerId);

		
		return "redirect:/customer/listCustomer";
	}
}
