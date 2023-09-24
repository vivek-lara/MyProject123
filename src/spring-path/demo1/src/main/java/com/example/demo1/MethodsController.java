package com.example.demo1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MethodsController {
	
	@	RequestMapping("m1")
	public String test1()
	{
		System.out.println("from test1");
		return "test1";
	}
	
	@GetMapping("m2")
	public String test2()
	{
		System.out.println("from test2");
		return "test2";
	}
	
	
	@PostMapping("m3")
	public String test3()
	{
		System.out.println("from test3");
		return "test3";
	}
	@PutMapping("m4")
	public String test4()
	{
		System.out.println("from test4");
		return "test4";
	}
	@PatchMapping("m5")
	public String test5()
	{
		System.out.println("from test5");
		return "test5";
	}
	@DeleteMapping("m6")
	public String test6()
	{
		System.out.println("from test6");
		return "test6";
	}
	

}
