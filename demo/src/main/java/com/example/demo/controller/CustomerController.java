package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

import org.springframework.ui.Model;

@Controller
public class CustomerController {
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	@GetMapping("/customers")
	public String listCustomers(Model model) {
		model.addAttribute("customer", customerService.getAllCustomer());
		return "customer";
	}
	

	@GetMapping("/customers/new")
	public String createCustomerForm(Model model) {
		
		 
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "CreateCustomer";
		
	}
	
	@PostMapping("/customers")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/customers/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "EditCustomer";
	}

	@PostMapping("/customers/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("customer") Customer customer,
			Model model) {
		
		Customer existingCustomer = customerService.getCustomerById(id);
		existingCustomer.setId(id);
		existingCustomer.setFirstName(customer.getFirstName());
		existingCustomer.setLastName(customer.getLastName());
		existingCustomer.setAddress(customer.getAddress());
		existingCustomer.setCity(customer.getCity());
		existingCustomer.setState(customer.getState());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setPhone(customer.getPhone());
		
		customerService.updateCustomer(existingCustomer);
		return "redirect:/customers";		
	}
	
	
	@GetMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomerById(id);
		return "redirect:/customers";
	}
	
		
	}

