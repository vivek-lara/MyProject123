package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("r1")
	public String test1(@RequestParam String param1)
	{
		System.out.println("param1:"+ param1);
		return "this is param1:" + param1;
		//http://localhost:9090/r1?param1=abc
	}
	
	@RequestMapping("r2")
	public String test2(@RequestParam String firstName,
			            @RequestParam Integer age)
	{
		//System.out.println("test2:"+firstName +","+age);
		return "test2:" + firstName + ","+ age;
		//http://localhost:9090/r2?firstName=abc&age=2
	}
	@RequestMapping("r3")
	public String test3(@RequestParam String lastName,
			           @RequestParam String firstName,
			           @RequestParam Integer age)
	{
		return "test3:"+lastName+","+age+","+firstName;
	}
	@RequestMapping("r4")
	public String test4(@RequestParam String firstName)
	{
		return "from test4:"+firstName;
		//http://localhost:9090/r4?hello=ramu -->error, required parameter name is not supplied i.e firstName
	}
	
	@RequestMapping("r5")
	public String test5(@RequestParam("hello") String firstName)
	{
		return "from test5:"+firstName;
		//http://localhost:9090/r5?hello=ramu
	}
	@RequestMapping("r6")
	public String test6(@RequestParam(value="hello") String firstName)
	{
		return "from test6:"+firstName;
		//http://localhost:9090/r6?hello=ramu
	}
	@RequestMapping("r7")
	public String test7(@RequestParam(name="hello") String firstName)
	{
		return "from test7:"+firstName;
		//http://localhost:9090/r7?hello=ramu
	}
	@RequestMapping("r8")
	public String test8(@RequestParam(required=false) String firstName)
	{
		return "from test8:"+firstName;
		//http://localhost:9090/r8
	}
	@RequestMapping("b")
	public String test9(@RequestParam String brandName)
	{
		return "hrt";
	}
}
