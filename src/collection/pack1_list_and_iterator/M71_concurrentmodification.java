package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class M71_concurrentmodification {
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
		Object obj;
		list.add(500); //concurrent modification is not allowed while using iterator,this type of iterator is called as failfast iterator not allowing concurrent modification
		
		while(it.hasNext())
		{
			obj = it.next();
			System.out.print(obj+",");
		}
	//	list.add(500); // we can add after iteration got over
	}
}
