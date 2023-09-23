package pack1_list_and_iterator;
interface U
{
	void test();
}
public class M59_lambdaexpression {
	public static void main(String[] args) {
		U u1 = new U()
				{
			     public void test() {
			     System.out.println("U-test");
				}
			};
     U u2 = ()-> System.out.println("U-test-lambda");
     
     u1.test();
     u2.test();
	}

}

