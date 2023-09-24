package com.example.demo1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	@RequestMapping("s1")
	public String hello1()
	{
		//some statement
		return "Hello from hello1 api";
	}
	
	@RequestMapping("s2/{arg}")
	public String hello2(@PathVariable String arg)
	{
		//some statement
		return "this is the input:"+ arg;	
		               //http://localhost:9090/s2/abc
	}
	
	@RequestMapping("s2/{arg1}/{param}")
	public String service3(@PathVariable String arg1,
			                @PathVariable String param) //any number of pathvariables
	{
		//some statement
		return "this is the input:"+ arg1+ ","+param ;	
		              //http://localhost:9090/s2/abc/def
	}
	
	@RequestMapping("s3/{p1}/{p2}/{p3}")
	public String service3(@PathVariable String p1,
			@PathVariable String p2,
			@PathVariable String p3) 
	{
		//some statement
		return "this is the input:"+ p1+ ","+p2+","+p3 ;	
		//http://localhost:9090/s3/p1/p2/p3
	}
	
	@RequestMapping("s4/firstName/{firstName}/lastName/{lastName}")
	public String service4(@PathVariable String firstName,
			@PathVariable String lastName) 
	{
		//some statement
		return "this is the input:"+ firstName+ ","+lastName ;
		   //http://localhost:9090/s4/firstName/a/lastName/b
	}
	
	@RequestMapping("s5/{param1}")
	public String service5(@PathVariable Integer param1) 
	{
		System.out.println("param1");
		return "parameter:"+ param1;	
	}
	@RequestMapping("s6/{param1}")
	public String service6(@PathVariable Integer param1) 
	{
		System.out.println("param1");
		int i = (param1/(param1 - 9));
		return "parameter:"+ param1;	
	}
	@RequestMapping("s7")
	public String service7(@PathVariable Integer param1) 
	{
		System.out.println("service7:"+ param1);
		return "parameter:"+ param1;	
	}
	@RequestMapping("s8")
	public String service8(@PathVariable(required = false) Integer param1) 
	{
		System.out.println("service8:"+ param1);
		return "parameter:"+ param1;	
	}
	@RequestMapping("s9/{param1}")
	public String service9(@PathVariable("param1") String firstName) 
	{
		System.out.println("service9:"+ firstName);
		return "parameter:"+ firstName;	
	}
	@RequestMapping("s10/{param1}")
	public String service10(@PathVariable(value="param1") String firstName) 
	{
		System.out.println("service10:"+ firstName);
		return "parameter:"+ firstName;	
	}
	@RequestMapping("s11/{param1}")
	public String service11(@PathVariable(name="param1") String firstName) 
	{
		System.out.println("service11:"+ firstName);
		return "parameter:"+ firstName;	
	}
	
}
