package pack1_list_and_iterator;

import java.util.ArrayList;

public class M12_removeall {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		
		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(700);
		list2.add(800);
		list2.add(200);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("-------------");
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println(list2);
	}

}
