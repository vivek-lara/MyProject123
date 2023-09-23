package pack1_list_and_iterator;

import java.util.ArrayList;

public class M26_removeAll_retainAll {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		ArrayList list2 = new ArrayList();
		list2.add(20);
		list2.add(60);
		list2.add(40);
		//list2.addAll(list1);
		list2.add(80);
		//list2.addAll(3,list1);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("----------");
		list1.removeAll(list2);
		//list2.removeAll(list1);
		//list2.removeAll(list2);
		//list1.retainAll(list2);
		
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
