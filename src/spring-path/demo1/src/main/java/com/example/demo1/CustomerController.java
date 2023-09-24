package com.example.demo1;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@RequestMapping("customer")
     public Customer save(@RequestBody Customer customer)
     {
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getAge());
		Address address = customer.getAddress();
		System.out.println(address.getHouseNo());
		System.out.println(address.getStreetName());
		System.out.println(customer.getMarks());
		System.out.println(Arrays.toString(customer.getEmailIds()));
		return customer;
     }
}
