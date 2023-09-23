package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M4_customer_address_autowire {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c4 = new ClassPathXmlApplicationContext("config.xml");
		Customer cst = c4.getBean("c3", Customer.class);
		System.out.println(cst.getFirstName());
		System.out.println(cst.getLastName());
		Address add = cst.getAddress();
		System.out.println(add.getHouseName());
		System.out.println(add.getStreetName());
	}

}
