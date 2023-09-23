package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1_animals {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new 
				ClassPathXmlApplicationContext("animals.xml");
		Animals obj = Context.getBean("v2", Animals.class);
		System.out.println(obj.getCow());
		System.out.println(obj.getBuffalo());
		System.out.println(obj.getNumberOfCows());
		System.out.println(obj.getNumberOfBuffalos());
	}

}
