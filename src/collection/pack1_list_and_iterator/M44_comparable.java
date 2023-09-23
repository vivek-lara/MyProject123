package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class E implements Comparable
{
	int i;
	E(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+ i;
	}
	public int compareTo(Object obj)
	{
		return i - ((E)obj).i;
	}
	
}

public class M44_comparable {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new E(4));
		list.add(new E(5));
		list.add(new E(10));
		list.add(new E(7));
		list.add(new E(8));
		list.add(new E(8));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	    Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
