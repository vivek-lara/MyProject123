package pack3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class M3_person_manager {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext(PersonManager.class);
		Person obj = Context.getBean("p1", Person.class);
		System.out.println(obj.getSomeDesc());
	}

}
