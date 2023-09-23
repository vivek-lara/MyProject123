package pack2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonManager {
	
	@Bean(name="personObj",  initMethod="method1", destroyMethod = "method2")
	public Person getPerson() {
		Person p1 = new Person();
		p1.setFirstName("abc");
		p1.setLastName("efg");
		return p1;
	}
}
