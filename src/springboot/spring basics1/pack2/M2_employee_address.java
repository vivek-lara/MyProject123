package pack2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class M2_employee_address {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext c1 = new AnnotationConfigApplicationContext(BeansConfig.class);
		Employee employee = c1.getBean("emp", Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		
		Address address = employee.getAddress();
		System.out.println(address.getHouseNo());
		System.out.println(address.getStreetName());
	}
}
