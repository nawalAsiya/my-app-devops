package com.ust.app.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.hellospring.model.Customer;

@RestController//controller returns a view and rest controller returns a resource
public class MyRestController {

	
	@GetMapping
public String  sayHello() {
	return "hellow nawal!how are you";
}
	@GetMapping("/greet/{username}")
	public String greet(@PathVariable String username ) {
		return"good afternoon ";
	}
//	@GetMapping("/customer")
//	public Customer getCustomer() {
//		Customer c=new Customer(1001,"nawal","nawal@gmail.com");
//				return c;
//		
//	}
	@GetMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customer;
	}
}
