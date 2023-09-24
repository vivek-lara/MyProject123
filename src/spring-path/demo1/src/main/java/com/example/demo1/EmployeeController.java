package com.example.demo1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController{
	
	@RequestMapping("emp")
	public Employee save(@RequestBody Employee employee)
	{
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getAge());
		return employee;
	}
}
/*
  {
  "firstName":"sdf",
  "lastName":"ghj",
  "age":21
  }
     ==>this is json object for Employee class
*/