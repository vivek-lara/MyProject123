package java8.pack1;
@FunctionalInterface
interface G
{
	public String oddEven(int a);
}
public class M7_lambda {
	public static void main(String[] args) {
		G g1 = a -> (a % 2 == 0 ? "even" : "odd");
		System.out.println("given number is "+g1.oddEven(15));
	}

}
