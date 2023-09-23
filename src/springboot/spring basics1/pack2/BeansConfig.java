package pack2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
	@Bean
	public Address getAddress() {
		Address a1 = new Address();
		a1.setHouseNo("abc/90");
		a1.setStreetName("BTM");
		return a1;
	}
	@Bean(name="emp")
	public Employee getEmployee()
	{
		Employee e1 = new Employee();
		e1.setFirstName("abc");
		e1.setLastName("efg");
		return e1;
	}
}
