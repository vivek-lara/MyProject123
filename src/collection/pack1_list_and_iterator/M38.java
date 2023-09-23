package pack1_list_and_iterator;

import java.util.ArrayList;

class A
{
	int i ;
	A(int i)
	{
		this.i = i;
	}
}
public class M38  {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new A(90));
		list.add(new A(910));
		list.add(new A(190));
		list.add(new A(9));
		System.out.println(list);
		
		A a1 = new A(90);
	//whenever we print a reference variable, object class toString
	//method overrided internally
		System.out.println(a1);
	}

}
