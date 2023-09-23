package pack1_list_and_iterator;

import java.util.ArrayList;

public class M3_setMethod {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(19.5);
		list.add("abc");
		list.add(true);
		list.add('t');
		System.out.println(list);
		list.set(2,"hello");
		System.out.println(list);
	}

}
