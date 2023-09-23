package pack1_list_and_iterator;

import java.util.ArrayList;

public class M6_getMethod {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(19.5);
		list.add("abc");
		list.add(true);
		list.add('t');
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println(list.get(4));
	    
		System.out.println(list);
	}
}
