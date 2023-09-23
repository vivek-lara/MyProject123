package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Z
{
	int i,j;
	public Z(int i, int j) {
		this.i = i;
		this.j = j;
	}
//	Z()
//	{
//		
//	}
	@Override
	public String toString() {
		return "(" + i + "," + j + ")";
	}
	class A1 implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			return ((Z)o1).i - ((Z)o2).i;
		}
	}

   class B1 implements Comparator
	 {
		public int compare(Object o1,Object o2)
		{
			return ((Z)o1).j - ((Z)o2).j;
		}
	  }
}
public class M56_innerclass {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Z(1,2));
		list.add(new Z(2,4));
		list.add(new Z(6,3));
		list.add(new Z(7,9));
		list.add(new Z(20,10));
		
		Collections.sort(list,new Z(10,20).new A1());
		System.out.println(list);
		
		Collections.sort(list,new Z(10,20).new B1());
		System.out.println(list);
	}
}
