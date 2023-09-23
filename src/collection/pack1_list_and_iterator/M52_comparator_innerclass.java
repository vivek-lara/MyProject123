package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class M
{
	int i;
	int j;
	int k;
	 public M(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString() {
		return " [" + i + ", " + j + ", " + k + "]";
	}
   
	  static class Sort1 implements Comparator
	   {
		   public int compare(Object o1,Object o2)
		   {
			   return ((M)o1).i - ((M)o2).i;
		   }
	   }
	  class Sort2 implements Comparator  //non static inner class
	   {
		   public int compare(Object o1,Object o2)
		   {
			   return ((M)o1).j - ((M)o2).j;
		   }
	   }
	  static class Sort3 implements Comparator
	   {
		   public int compare(Object o1,Object o2)
		   {
			   return ((M)o1).k - ((M)o2).k;
		   }
	   }
 } 
public class M52_comparator_innerclass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new M(2,3,4));
		list.add(new M(5,3,6));
		list.add(new M(4,6,8));
		list.add(new M(10,30,40));
		list.add(new M(232,333,422));
		list.add(new M(32,344,44));
		System.out.println(list);
		Collections.sort(list,new M.Sort1());
		System.out.println(list);
		Collections.sort(list,new M(2,3,1).new Sort2());
		System.out.println(list);
		Collections.sort(list,new M.Sort3());
		System.out.println(list);
		}
}
/*
 * if inner class is static then we can access it in other class by using class name
 * but if inner class is non static ,we can only access that class in other class by using 
 * object of that class in which inner class is formed,as we used in above program sort2 class is non static
 * 
 */
