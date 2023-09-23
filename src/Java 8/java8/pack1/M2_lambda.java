package java8.pack1;
//@FunctionalInterface
interface B
{
	public void m();
}
public class M2_lambda {
	public static void main(String[] args) {
		B b1 = () -> System.out.println("from lambda expression");
		b1.m();
		
		Sayable s = () -> "nothing to say";
		System.out.println(s.say());
	}

}

interface Sayable
{
	public String say();
}
