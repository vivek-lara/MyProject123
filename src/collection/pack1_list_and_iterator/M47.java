package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class H implements Comparable
{
	String s1;
	H(String s1)
	{
		this.s1 = s1;
	}
	public String toString()
	{
		return s1;
	}
	public int compareTo(Object obj)
	{
		return s1.compareTo(((H)obj).s1);
	}
}
public class M47 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new H("abc"));
		list.add(new H("ac"));
		list.add(new H("abcd"));
		list.add(new H("abcz"));
		list.add(new H("abjd"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	

}
