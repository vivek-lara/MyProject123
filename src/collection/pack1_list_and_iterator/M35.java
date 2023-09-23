package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

public class M35 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(200.0);
		list.add(0);
		list.add(400);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		//for sorting all elements should be same type.through comaparision we can achieve sorting
		//no elements should be null while sorting
		
		
	}

}
