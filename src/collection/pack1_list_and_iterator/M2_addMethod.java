package pack1_list_and_iterator;

import java.util.ArrayList;

public class M2_addMethod {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(19.5);
		list.add("abc");
		list.add(true);
		list.add('t');
		System.out.println(list);
		list.add(2,"dds");
		System.out.println(list);
	}

}
