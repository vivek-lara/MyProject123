package java8.pack1;
@FunctionalInterface
interface F
{
	public int findLargest(int a, int b);
}
public class M6_lambda {
	public static void main(String[] args) {
		F f1 = (a,b) -> (a > b ? a : b);
		int i = f1.findLargest(101, 9);
		System.out.println("Largest number between 101 and 9 is "+ i);
	}

}
