package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M6_person_constructor {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  Context = new ClassPathXmlApplicationContext("config.xml");
		Person obj = Context.getBean("p2", Person.class);
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		Address add= obj.getAddress();
		System.out.println(add.getHouseName());
		System.out.println(add.getStreetName());
	}


}
