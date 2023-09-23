package pack1_list_and_iterator;

import java.util.Enumeration;
import java.util.Vector;

public class M79_vector {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(400);
		v1.add(500);
		v1.add(600);
		System.out.println(v1);
		Enumeration e1 = v1.elements(); //Enumeration not supporting in the arrayList
		while(e1.hasMoreElements())  //through Enumeration we can read only one time like iterator
		{                             //but enumerator not extending to iterator its separate stream
			System.out.println(e1.nextElement());
		}
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
	}

}
