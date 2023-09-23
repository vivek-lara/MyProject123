package pack3;

import org.springframework.stereotype.Component;

@Component
public class Address {
	public Address() {
		System.out.println("Address()");
	}
	public String sayHello() {
		System.out.println("sayHello");
		return "sayHello";
	}

}
//if any class does not have fields then declared that class as component by @component
//component is a super annotation to the controller,service and repository
