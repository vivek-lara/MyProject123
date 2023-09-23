package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class X
{
	int i, j;
	X(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return"("+i+","+j+")";
	}
}
public class M53_annonymousinnerclass {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new X(10,20));
		list.add(new X(11,22));
		list.add(new X(12,23));
		list.add(new X(110,2));
		list.add(new X(1000,202));
		list.add(new X(0,30));
		list.add(new X(15,40));
		System.out.println(list);
		
		Comparator c1 = new Comparator() {
			public int compare(Object o1, Object o2)
			{
				return ((X)o1).i - ((X)o2).i;
			}
		};
		Collections.sort(list,c1);
		System.out.println(list);
			
			Comparator c2 = new Comparator() {
				public int compare(Object o1, Object o2)
				{
					return ((X)o1).j - ((X)o2).j;
				}
		};
		Collections.sort(list,c2);
		System.out.println(list);
	}
}
		
	


