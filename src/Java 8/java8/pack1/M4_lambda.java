package java8.pack1;
@FunctionalInterface
interface D1
{
	public int squareOf(int i);
	
}

public class M4_lambda {
	public static void main(String[] args) {
		D1 d1 = i -> i*i;
		System.out.println(d1.squareOf(45));
	}

}
