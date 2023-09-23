package pack3;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	@Autowired
	private Address address;
	
	public String getSomeDesc()
	{
		String s1 = address.sayHello();
		return "from person:"+ s1;
	}

}
