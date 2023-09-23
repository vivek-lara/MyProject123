package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class J 
{
	int i;
	int k;
	public J(int i, int k) {
		super();
		this.i = i;
		this.k = k;
	}
	
	@Override
	public String toString() {
		return "(" + i + "," + k + ")";
	}

}
	class SortBasedOnIValue implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			return ((J)o1).i - ((J)o2).i;
		}
	}
	class SortBasedOnKValue implements Comparator
	{
		public int compare (Object o1,Object o2)
		{
			return ((J)o1).k - ((J)o2).k;
		}
	}
public class M49_comparator {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new J(2,3));
		list.add(new J(20,30));
		list.add(new J(12,3));
		list.add(new J(2,33));
		list.add(new J(2222,333));
		list.add(new J(2222,32));
		System.out.println(list);
		Collections.sort(list,new SortBasedOnKValue());
		System.out.println(list);
		
		Collections.sort(list,new SortBasedOnIValue());
		System.out.println(list);
	}

}
