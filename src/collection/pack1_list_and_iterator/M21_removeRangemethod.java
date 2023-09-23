package pack1_list_and_iterator;

import java.util.ArrayList;

public class M21_removeRangemethod extends ArrayList{
	public static void main(String[] args) {
        M21_removeRangemethod list1 = new M21_removeRangemethod();
		list1.add("abc");
		list1.add("xyz");
		list1.add("hello");
		list1.add("test");
		list1.add("java");
		list1.add("btm");
		list1.add("html");
		list1.add("spring");
		list1.add("js");
		System.out.println(list1);
		list1.removeRange(1, 4);
		System.out.println(list1);
	}

}
