package pack5_concurrentpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class M1 {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		Iterator<Integer> it = list.iterator();
		
		list.add(100);      
		while(it.hasNext())
		{
		  System.out.print(it.next()+",");
		}
	}

}
