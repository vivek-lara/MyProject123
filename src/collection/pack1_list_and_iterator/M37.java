package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

public class M37 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(190);
		list1.add(120);
		list1.add(10);
		list1.add(100);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2.add("abc");
		list2.add("def");
		list2.add("acd");
		list2.add("daf");
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		

		ArrayList list3 = new ArrayList();
		list3.add(new Thread("abc"));
		list3.add(new Thread("def"));
		list3.add(new Thread("acd"));
		list3.add(new Thread("daf"));
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
	}
    //Thread class not implementing comparable interface
}
