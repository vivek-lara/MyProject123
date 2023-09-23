package java8.pack1;
@FunctionalInterface
interface E1
{
	public int StringLength(String s);
	
}
public class M5_lambda {
	public static void main(String[] args) {
		E1 e1 = s -> s.length();
		int i = e1.StringLength("vivek");
		System.out.println("length of the given string is "+ i);
	}

}
