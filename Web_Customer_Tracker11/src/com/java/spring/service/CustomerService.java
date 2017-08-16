package com.java.spring.service;

import java.util.List;

import com.java.spring.Entity.Customer;

public interface CustomerService {
	
	public List<Customer> getcustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}
