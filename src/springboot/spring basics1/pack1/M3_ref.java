package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M3_ref {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  Context = new ClassPathXmlApplicationContext("config.xml");
		Customer c = Context.getBean("c1", Customer.class);
		System.out.println(c.getFirstName());
		System.out.println(c.getLastName());
		Address add = c.getAddress();
		System.out.println(add.getHouseName());
		System.out.println(add.getStreetName());
	}

}
