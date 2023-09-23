package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class D
{
	int i;  
	D(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i"+ i;
	}
}

public class M43 {
     public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new D(9));
		list.add(new D(19));
		list.add(new D(29));
		list.add(new D(39));
		list.add(new D(94));
		list.add(new D(92));
		list.add(new D(59));
		
	
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
