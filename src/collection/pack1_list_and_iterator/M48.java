package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class I implements Comparable
{
	int i;
	I(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i="+ i;
	}
	public int compareTo(Object o)
	{
		return i - (((I)o).i);
	}
}
public class M48 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new I(500));
		list.add(new I(400));
		list.add(new I(700));
		list.add(new I(300));
		list.add(new I(200));
		System.out.println(list);
		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
