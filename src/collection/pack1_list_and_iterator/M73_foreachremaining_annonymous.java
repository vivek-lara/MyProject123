package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class M73_foreachremaining_annonymous {
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
		it.forEachRemaining(new Consumer() {
			public void accept (Object obj) {
			System.out.println("preocessing:"+obj);
			}
			});
		}
}
