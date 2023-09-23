package pack1_list_and_iterator;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M78 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		System.out.print(list);//toString method to print the elements
		System.out.println();
		for(int i = 0; i<list.size();i++)//for loop to print the elements
		{
			System.out.print(list.get(i)+",");
		}
		System.out.println();
		for(Object o:list)       //enhanced for loop to print the elements
		{
			System.out.print(o+",");
		}
		System.out.println();
        Iterator it = list.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next()+",");
        }
        System.out.println();
        ListIterator it1 = list.listIterator();
       
//        while(it1.hasNext())
//        {
//        	System.out.print(it1.next()+",");
//        }
//        System.out.println();
//        Object obj;
//        while(it1.hasPrevious())
//        {   
//        	obj = it1.previous();
//        	System.out.print(obj+",");
//        	it1.remove();
//        	if(obj.equals(100))
//        	{
//        		it1.remove();
//        	}
//        }
//        System.out.println();
//    	System.out.print(list);
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(list);
        it1.remove();
        System.out.print(list);
        System.out.println(it1.hasPrevious());
        System.out.println(it1.previous());
        it1.remove();
        System.out.print(list);
        System.out.println(it1.previous());
        System.out.println(it1.next());
        System.out.println(it1.previous());
        //System.out.println(it1.previous());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());
        it1.set(35);
        System.out.println(list);
        System.out.println(it1.next());
        it1.add(3);
        System.out.println(list);
        System.out.println(it1.next());
       
        Object  o; 
        while(it1.hasPrevious()) {//set to starting index
        	it1.previous(); 
        }
        while(it1.hasNext())
        {
        	o = it1.next();
        	
        	if(o.equals(103))
        	{
        		it1.set(350);
        	}
        	
        }
        System.out.println();
        System.out.println(list);
    }
}
