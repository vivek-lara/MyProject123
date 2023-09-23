package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class K
{
	String s1;
	String s2;
	K(String s1,String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	public String toString()
	{
		return "("+s1+","+s2+")";
	}
}
class ComparatorS1Type implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return ((K)o1).s1.compareTo(((K)o2).s1);
	}
}
class ComparatorS2Type implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return ((K)o1).s2.compareTo(((K)o2).s2);
	}
}

public class M50_comparator_string {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new K("234","23"));
		list.add(new K ("1234","asd"));
		list.add(new K("134","30.4"));
		list.add(new K("abc","345"));
		list.add(new K("Zxyz","ghj"));
		list.add(new K("abcd","tyu"));
		list.add(new K("axyz","dfg"));
		System.out.println(list);
		
		Collections.sort(list,new ComparatorS1Type() );
		System.out.println(list);
		
		Collections.sort(list,new ComparatorS2Type());
		System.out.println(list);
	}

}
