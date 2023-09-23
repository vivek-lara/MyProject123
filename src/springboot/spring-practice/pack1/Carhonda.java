package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Carhonda {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				                   ClassPathXmlApplicationContext("car.xml");
		  Car obj = context.getBean("c1",Car.class);
		  System.out.println(obj.getCarName());
		  System.out.println(obj.getModelName());
		  System.out.println(obj.getColor());
		  System.out.println(obj.getAmount());
	}

}
