package pack1_list_and_iterator;

import java.util.ArrayList;

public class M16 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(500);
		list1.add(800);
		
		System.out.println(list1);
		System.out.println(list1.remove(Integer.valueOf(800)));
		//remove which takes object
		System.out.println(list1);
	}
}
