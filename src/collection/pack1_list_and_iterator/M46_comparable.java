package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class G implements Comparable
{
	String s1;
	G(String s1)
	{
		this.s1 = s1;
	}
	public String toString()
	{
		return s1;
	}
	public int compareTo (Object obj)
	{
		return s1.compareTo(((G)obj).s1);
	}
}
public class M46_comparable {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new G("ab"));
		list.add(new G("abc"));
		list.add(new G("af"));
		list.add(new G("abd"));
		list.add(new G("a"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
