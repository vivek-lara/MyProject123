package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M2 {
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new 
			ClassPathXmlApplicationContext("beans.xml");
	
	Person1 obj1 = context.getBean("v1",Person1.class);
	System.out.println(obj1.getFirstName());
	System.out.println(obj1.getLastName());
	System.out.println(obj1.getAge());
	
  }     
}
