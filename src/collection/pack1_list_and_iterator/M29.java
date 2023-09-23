package pack1_list_and_iterator;

import java.util.ArrayList;

public class M29 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("asd");
		list.add(100);
		list.add("java");
		list.add("javaScript");
		list.add(true);
	/*	for(Object obj:list)
		{
			System.out.println(obj);
		} 
		for(int i = 0; i < list.size();i++)
		{
			System.out.println(list.get(i));
		}*/
	
		System.out.println(	list.size());
	
	}

}
