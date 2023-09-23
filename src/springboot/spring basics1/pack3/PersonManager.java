package pack3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="pack3")
public class PersonManager {
	
	@Bean(name="p1")
	public Person getPerson()
	{
		Person p1 = new Person();
		return p1;
	}
	
}
//if any class does not fields then declared that class as component by @component
//--> component is a super annotation to the controller,service and repository

