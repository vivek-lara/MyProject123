package pack1_list_and_iterator;

import java.util.ArrayList;

public class M30 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
		list1.add("abc");
		list1.add("xyz");
		list1.add("hello");
		list1.add("test");
		list1.add("test");
		list1.add("java");
		list1.add("btm");
		list1.add("html");
		list1.add("spring");
		list1.add("js");
		System.out.println(list1.contains("test"));
		System.out.println(list1.contains("angular"));
	}

}
