package pack1_list_and_iterator;

import java.util.ArrayList;

public class M25 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(12);
		list.add("abc");
		list.add(12.5);
		list.add(false);
		list.add('e');
		list.add('e');
		list.add('e');
		System.out.println(list);
		list.add(20);
		list.add(2,12.5);
		//list.add(1,1.4);
		list.set(0, "ab");
		System.out.println(list);
		list.set(3,'f');
		System.out.println(list);
	//	System.out.println(list.get(0));
	//	System.out.println(list.get(4));
	//	System.out.println(list);
	//	list.remove("abc");
	//	list.remove(false);
	   
		System.out.println(list.get(5));
		
		//Integer obj1=Integer.valueOf(20);
		//list.remove(obj1);
		//list.remove(Integer.valueOf(20));
		list.set(5,3);
		list.remove(Character.valueOf('f'));
		list.remove(Character.valueOf('e'));
		list.remove(Character.valueOf('e'));
		list.remove(Character.valueOf('e'));
		
		list.remove(Integer.valueOf(3));
		
		System.out.println(list);
		System.out.println(list.contains(12.5));
		System.out.println(list.contains("abcd"));
		
		System.out.println(list);
		
		
	}

}
