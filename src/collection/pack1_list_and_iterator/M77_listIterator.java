package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class M77_listIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		ListIterator it = list.listIterator();
		System.out.println(it.next());
		System.out.println(it.nextIndex());
		System.out.println(it.next());
		System.out.println(it.nextIndex());
		System.out.println(it.next());
		System.out.println(it.nextIndex());
		it.add(50);
		Object obj;
		while(it.hasNext()) {
			obj=it.next();
			System.out.print(obj+",");
		}
	}

}
