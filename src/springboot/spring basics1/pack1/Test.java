package pack1;

public class Test {
	private String firstName;
	public Test() {
		System.out.println("Test()");
	}
	public void setFirstName(String firstName) {
		System.out.println("setFirstName");
		this.firstName = firstName;
	}
	public String getFirstName() {
		System.out.println("getFirstName");
		return firstName;
	}
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("method2");
	}
}
