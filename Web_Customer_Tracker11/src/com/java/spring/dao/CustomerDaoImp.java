package com.java.spring.dao;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.spring.Entity.Customer;


@Repository
public class CustomerDaoImp implements CustomerDAO {
	
	//need dependency of Session Factory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override

	public List<Customer> getCustomer() {
		// get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create the Query
		  
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName" ,Customer.class);
		
		//Execute the query and get the result set
		
		List<Customer> customers = theQuery.getResultList();
		
		//return the result
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// getting the current session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer... finally
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		// get the cuuren hibernate session
		
	 Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrive and read from data base
		
	 Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}

	/*@Override
	public void deleteCusomer(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete the object with primary key
		
		Query query = currentSession.createQuery("delete from customer where id=:customerId");
		query.setParameter("customerId", theId);
		query.executeUpdate();
		
	}*/

	@Override
	public void deleteCustomer(int theId) {
Session currentSession = sessionFactory.getCurrentSession();
		
		// delete the object with primary key
		
		Query query = currentSession.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", theId);
		query.executeUpdate();
		
	}

}
