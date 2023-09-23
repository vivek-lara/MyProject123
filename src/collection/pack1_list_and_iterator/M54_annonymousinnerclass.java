package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Y
{
	int i, j;
	Y(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return"("+i+","+j+")";
	}
}
public class M54_annonymousinnerclass {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Y(10,20));
		list.add(new Y(11,22));
		list.add(new Y(12,23));
		list.add(new Y(110,2));
		list.add(new Y(1000,202));
		list.add(new Y(0,30));
		list.add(new Y(15,40));
		System.out.println(list);
		
			
			Collections.sort(list, new Comparator() {
				public int compare(Object o1, Object o2)
				{
					return ((Y)o1).i - ((Y)o2).i;
				}
		});
		System.out.println(list);
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2)
			{
				return ((Y)o1).j - ((Y)o2).j;
			}
	});
		System.out.println(list);
	
	}
}
		
	


