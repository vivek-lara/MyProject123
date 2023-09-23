package java8.pack1;
@FunctionalInterface
interface C1
{
	public void add(int a, int b);
}
class C implements C1
{
	public void add(int a,int b)
	{
		
		System.out.println(a+b);
		
	}
}
public class M3_lambda {
	public static void main(String[] args) {
		C1 c1 = (a,b) -> System.out.println("sum of "+a+" and "+b+" = "+(a+b));;
		c1.add(2,3);
	}

}
