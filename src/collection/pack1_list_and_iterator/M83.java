package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.function.Consumer;

class M83{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		System.out.println(list);
		ListIterator it =list.listIterator();
		Consumer consumer = new Consumer() {
			public void accept(Object o)
			{
				System.out.print(o+",");
			}
		};
		it.forEachRemaining(consumer);
	    System.out.println();
        System.out.println(list);
	}

}
