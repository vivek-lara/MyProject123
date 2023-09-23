package pack2_set;

import java.util.HashSet;

class D
{
	int i;
	D(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i="+i+")";
	}
}
public class M11 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add(90);
		set1.add(90);
		System.out.println(set1);
		
		HashSet set2 = new HashSet();
		set2.add("abc");
		set2.add("abc");
		System.out.println(set2);
		
		HashSet set3 = new HashSet();
		set3.add(new D(90));
		set3.add(new D(90));
		System.out.println(set3);
	}
  
}
/*
 * in all wrapper class and string class object class hashcode and equals got overrided 
 */
