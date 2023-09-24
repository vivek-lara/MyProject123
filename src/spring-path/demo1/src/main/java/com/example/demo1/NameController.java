package com.example.demo1;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NameController {
	
	@RequestMapping("firstName")
	public String Name(@RequestBody String firstName)
	{
		return firstName;
	}
	
	@RequestMapping("a")
	public String firstName(@RequestParam String firstName)
	{
	  	return firstName;
	}
}

