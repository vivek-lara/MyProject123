package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M86_iterator_foreachremaining {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(700);
		list.add(600);
		list.add(500);
		list.add(800);
		list.add(600);
		list.add(400);
		list.add(300);
		System.out.println(list);
		Iterator it = list.iterator();
		it.forEachRemaining(o -> System.out.print(o+","));
		System.out.println();
		System.out.println(list);
		
	}

}
