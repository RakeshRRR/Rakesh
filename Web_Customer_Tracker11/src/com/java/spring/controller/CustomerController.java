package com.java.spring.controller;

import java.util.List;








import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.spring.Entity.Customer;
import com.java.spring.dao.CustomerDAO;
import com.java.spring.service.CustomerService;
import com.sun.tracing.dtrace.ModuleAttributes;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need depency injection Of Customer Service layer
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	
	public String listCustomers(Model theModel){
		
		// get the customer from Serive layer
		
		List<Customer> theCustomer= customerService.getcustomers();
		
		//Add the customers to the MOdel
		
		theModel.addAttribute("customers",theCustomer);
		
		return "list-customer";
		
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		
		// create the model attribute to bind form data
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer" , theCustomer);
		
		
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
		
		//save the customer using our service
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
			Model theModel){
		
	//	get the customer from data base
		
		Customer theCustomer = customerService.getCustomer(theId);
		
		 
	//	set the customers to model attribute to pre- papulate the form
		theModel.addAttribute("customer" , theCustomer);
		
	// send it to our form	
		
		return "customer-form";
		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int theId){
		 customerService.deleteCustomer(theId);
		
		
		return "redirect:/customer/list";
		
	}
		
	
	
	

}
