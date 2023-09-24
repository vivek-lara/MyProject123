package com.example.demo1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("done");
	}
		@RequestMapping("t")    //http://localhost:9090/t
		public void test1() {
			System.out.println("from test1");
		}
		@RequestMapping("t1")
		public String test2()
		{
			System.out.println("from test2");
			return "abc";
		}
		@RequestMapping("t2")
		public int test3()
		{
			System.out.println("from test3");
			return 1000;
		}
		@RequestMapping("t3")
		public Double test4()
		{
			System.out.println("from test4");
			return 20.0;
		}
		@RequestMapping("t4")
		public int[] test5()
		{
			 return new int[] {10,20,30};
		}
		@RequestMapping("t5")
		public List<String> test6()
		{
		  return Arrays.asList("abc","efg","yes");
		}
		@RequestMapping("t6")
		public Map<String,Integer> test7()
		{
			Map<String,Integer> map = new HashMap<>();
			map.put("abc", 22);
			map.put("def", 23);
			return map;
		}
		@RequestMapping("t7")
		public Person test8()
		{
			Person p1 = new Person();
			p1.setFirstName("abc");
			p1.setLastName("def");
			return p1;
		}
}
