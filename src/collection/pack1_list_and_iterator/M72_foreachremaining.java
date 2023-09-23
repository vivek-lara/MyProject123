package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class M72_foreachremaining {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		Iterator it = list.iterator();  
		Consumer c1 =new Consumer() {
			public void accept(Object t) {
				System.out.println("processing:"+ t);
				}
		};
		it.forEachRemaining(c1);  //for every element of arraylist it is calling accept method on c1
	}

}
