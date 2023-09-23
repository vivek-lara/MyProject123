package pack1;

public class Employee {
	public Employee()
	{
		System.out.println("Employee()");
	}
	private String firstName;
	private String lastName;

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
