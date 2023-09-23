package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class M70_hasnext_next_remove {
	@SuppressWarnings("unchecked")
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
		while(it.hasNext())
		{
			obj = it.next();
			System.out.print(obj+",");
    		if(obj.equals(104))
			{
		     it.remove();
			}
		}
		System.out.println(list);
	}
}	

