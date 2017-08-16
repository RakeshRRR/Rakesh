package com.java.spring.service;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.spring.Entity.Customer;
import com.java.spring.dao.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//need injecting customerDAO dependency
	@Autowired
	private CustomerDAO customerDAO;
	

	@Override
	@Transactional
	public List<Customer> getcustomers() {
		
		return customerDAO.getCustomer();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		 customerDAO.saveCustomer(theCustomer);
		
	}


	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(theId);
	}


	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// connecting DAO
		customerDAO.deleteCustomer(theId);
		
		
	}

}
