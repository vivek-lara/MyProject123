package pack1_list_and_iterator;

import java.util.ArrayList;

public class M24 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
	/*	list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		list.add("btm");
		list.add("html");
		list.add("spring");
		list.add("js");  */
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
	for(String s1:args)
	{
		list.add(s1);	
	}
	System.out.println(list);
	}

}
