package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M2_student {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("config.xml");
		
		Student obj1 = context.getBean("s1", Student.class);
		System.out.println(obj1.getFirstName());
		System.out.println(obj1.getLastName());
	}

}
