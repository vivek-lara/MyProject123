package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M7_test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  Context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("-------------------");
		Test obj= Context.getBean("t1", Test.class);
		System.out.println(obj.getFirstName());
		
		Context.registerShutdownHook();
	}

}
