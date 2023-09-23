package pack1_list_and_iterator;
interface V2
{
	int test();
}
public class M60_lambda {
	public static void main(String[] args) {
		U u1 = () ->{
			System.out.println("V1-test");
			System.out.println("V1-test");
			System.out.println("V1-test");
		};
		V2 v2 = ()-> 100;
		V2 v3 = ()->{
			System.out.println("V2-test");
			return 100;
		};
		System.out.println(v2.test());
		System.out.println(v3.test());
	}

}
