 package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class M67_hasnext_next {
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
		Iterator it = list.iterator();   //its an interface
//		Object obj;
//		while(it.hasNext())
//		{
//			obj = it.next();
//			System.out.print(obj+",");
//		}
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
    }
}	
