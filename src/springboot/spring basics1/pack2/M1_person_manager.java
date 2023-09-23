package pack2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class M1_person_manager {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext c1 = new AnnotationConfigApplicationContext(PersonManager.class);
		Person person = c1.getBean("personObj", Person.class);
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		
		c1.registerShutdownHook();
	}
}
