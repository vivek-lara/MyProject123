package pack1_list_and_iterator;

import java.util.ArrayList;

public class M17 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("abc");
		list1.add("xyz");
		list1.add("hello");
		list1.add("test");
		
		System.out.println(list1);
		System.out.println(list1.remove("hello"));
		//remove which takes object
		System.out.println(list1);
	}
}
