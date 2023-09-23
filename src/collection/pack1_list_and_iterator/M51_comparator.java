package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class N
{
	int i;
	int j;
	N(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
}
class Sort1 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((N)o1).i - ((N)o2).i;
	}
}
class Sort2 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((N)o1).j - ((N)o2).j;
	}
}
public class M51_comparator {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new N(20,30));
		list.add(new N(10,40));
		list.add(new N(200,300));
		list.add(new N(25,15));
		list.add(new N(525,115));
		list.add(new N(25,150));
		System.out.println(list);
		Collections.sort(list, new Sort1());
		System.out.println(list);
		Collections.sort(list, new Sort2());
		System.out.println(list);
	}

}
