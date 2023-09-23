package pack1_list_and_iterator;

import java.util.ArrayList;

public class M40 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		for(String s1 : args)
		{
			if(!list.contains(s1))
			{
				list.add(s1);
			}
		}
		System.out.println(list);
	}

}
