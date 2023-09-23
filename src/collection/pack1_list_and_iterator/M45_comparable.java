package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class F implements Comparable
{
	int i;
	int j;
	F(int i, int j)
	{
		this.i =i;
		this.j = j;
	}
	public String toString()
	{
		return "(" + i +","+ j+")";
	}
	public int compareTo(Object obj)
	{
		return j - ((F)obj).j;
		//return i - ((F)obj).i;
	}
}
public class M45_comparable {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new F(10,20));
		list.add(new F(1,230));
		list.add(new F(20,30));
		list.add(new F(100,4));
		list.add(new F(101,200));
		System.out.println(list);
		Collections.sort(list);
		//Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
