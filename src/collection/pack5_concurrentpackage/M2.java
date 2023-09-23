package pack5_concurrentpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class M2 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();
		list.add(30);
		list.add(40);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		Iterator<Integer> it = list.iterator();
		
		list.add(200);      
		while(it.hasNext())
		{
		  System.out.print(it.next()+",");
		}
		System.out.println(list);
	}

}
/*
*in concurrent package all the classes giving fail safe iterator
*here concurrent modification is allowed hence calling fail safe iterator.
*/