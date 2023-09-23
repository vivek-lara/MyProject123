package pack1_list_and_iterator;

import java.util.ArrayList;

public class M65 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		//System.out.println(list);
		for(int i = 0;i<list.size();i++)
		{
			System.out.print(list.get(i)+",");
		}
	}

}
