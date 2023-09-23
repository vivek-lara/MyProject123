package pack1_list_and_iterator;

import java.util.ArrayList;

class B
{
	int i;
	B(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i:"+ i ;
	}
}
public class M39 {
	public static void main(String[] args) {
		B b1 = new B(90);
		System.out.println(b1);
		
		ArrayList list = new ArrayList();
		list.add(new B(9));
		list.add(new B(19));
		list.add(new B(119));
		list.add(new B(97));
		list.add(new B(3));
		
		System.out.println(list);
	}
	
	

}
