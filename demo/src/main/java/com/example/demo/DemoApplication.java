package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
	     
				Customer customer2 = new Customer("Divya", "Kurumkar","karvenagar", "Pune", "Maharashtra", "divya@gmail.com","9907102949");
	             customerRepository.save(customer2);
//		 

//		 
	        Customer customer4 = new Customer("Rohan", "Kurumkar","Varvand", "Daund", "Maharashtra", "rohan@gmail.com","9890038412");
	        customerRepository.save(customer4);
		 
		
	}

}

