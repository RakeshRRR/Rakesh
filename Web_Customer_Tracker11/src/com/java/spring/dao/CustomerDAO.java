package com.java.spring.dao;

import java.util.List;

import com.java.spring.Entity.Customer;


public interface CustomerDAO {
	
	
	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	//public void deleteCusomer(int theId);

	public void deleteCustomer(int theId);

}
