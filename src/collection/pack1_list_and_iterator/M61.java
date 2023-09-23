package pack1_list_and_iterator;
interface W
{
	void test(int i);
}
public class M61 {
	public static void main(String[] args) {
		W obj = (int i) ->System.out.println("obj-test");
		
		W obj1 = (i) ->System.out.println("obj1-test");
		
		W obj2 = (k) ->System.out.println("obj2-test");
		
		obj.test(10);
		obj1.test(10);
		obj2.test(10);
	}

}
