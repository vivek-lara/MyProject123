package pack2;

import java.util.ArrayList;
import java.util.TreeSet;

/*
 * find out nearest number for every number.
 */
public class M11 {
	public static void main(String[] args) {
		int[] arr = {6,7,1,2,3,14,5,6,7,1,8,9,11,12,22,26,23,25,24};
		
		 ArrayList<Integer>list = new ArrayList<>();
		  for(int j: arr)
		  {
			  list.add(j);
		  }
		  System.out.println(list);
		 
		TreeSet<Integer>set = new TreeSet<>();
		 for(int i: arr)
		  {
			  set.add(i);
		  }
		 System.out.println(set);
		 for(int i=0; i<list.size();i++)
		 {
			 if(i==0)
			 {
				 System.out.println("for-"+list.get(i)+":"+list.get(i+1));
			 }
			 else if(i==list.size()-1)
			 {
				 System.out.println("for-"+list.get(i)+":"+(list.get(i-2)));
			 }
			 else if(list.get(i)-list.get(i-1)== list.get(i+1)-list.get(i))
			 {
				 System.out.println("for-"+list.get(i)+":"+list.get(i-1)+","+list.get(i+1));
			 }
			 else if(list.get(i+1)-list.get(i)>list.get(i)-list.get(i-1))
			 {
				 System.out.println("for-"+list.get(i)+":"+list.get(i-1));
			 }
			 else
			 {
				 System.out.println("for-"+list.get(i)+":"+list.get(i+1));
			 }
		 }
	}
}
		  