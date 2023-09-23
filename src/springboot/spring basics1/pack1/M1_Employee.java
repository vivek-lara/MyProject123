package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1_Employee {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("config.xml");
		System.out.println("-------------------");
		Employee obj = context.getBean("v2",Employee.class);
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		
		Employee obj1 = context.getBean("v2",Employee.class);
		System.out.println(obj1.getFirstName());
		System.out.println(obj1.getLastName());
		
		System.out.println(obj == obj1);
		
		Employee obj2 = context.getBean("v2",Employee.class);
		System.out.println(obj2.getFirstName());
		System.out.println(obj2.getLastName());
		
		System.out.println(obj == obj2);
		System.out.println(obj1 == obj2);
	}
}
//obj and obj1  and obj2 all are pointing to same object,and it will be for entire life 
//,only one object in spring
//this is called as default scope(singleton, one object)
//if we go for new bean definition we  get a different object
//on every bean creation different object creating
//for scope prototype in xml file a new object is creating otherwise only one object
//default scope is singleton
//while loading to xml file bean objects is creating only to scope singleton,and if 
// bean is prototype diff object will be creating while calling getbean method
//injecting data to the attributes is called as injectable
// three types of injection available
// 1. setter injection 2.interface 3.constructor
//spring is supporting only setter and constructor injection
