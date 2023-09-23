package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

public class M36 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(null);//array list allows any no. of null element
		               //but while sorting null is not allowed
		list.add(0);
		list.add(400);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	//1.a separate comparator object should be supplied or all element 
	//should be comparable type while sorting
	//2.all object should be same type for sorting
	//3.null should not be there while sorting
		
}
