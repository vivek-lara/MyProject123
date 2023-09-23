package pack2_set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class B 
{
	int i,j;
	B(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}

}
public class M7 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	TreeSet set1 = new TreeSet((o1,o2)-> {
		if(((B)o1).i == ((B)o2).i)
		 { 
			if(((B)o1).hashCode() == ((B)o2).hashCode())
		   { 
			 if(((B)o1).equals(o2))
				 {
					 return 0;
				 }
				 else 
				 {
					 return ((B)o1).j - ((B)o2).j;
				 }
		  }
			else
			{
				return ((B)o1).j - ((B)o2).j;
			}
		}
		else
		{
			return ((B)o1).i - ((B)o2).i;
		}
	});
		set1.add(new B(10,20));
		set1.add(new B(110,220));
		set1.add(new B(110,220));
		set1.add(new B(110,220));
		set1.add(new B(110,220));
		set1.add(new B(110,220));
		set1.add(new B(110,220));
		set1.add(new B(10,201));
		set1.add(new B(0,230));
		set1.add(new B(100,20));
		set1.add(new B(100,21));
		set1.add(new B(101,20));
		set1.add(new B(100,20));
		set1.add(new B(210,270));
		System.out.println(set1);
		TreeSet set2 = new TreeSet((o1,o2)-> {
		if(((B)o1).j == ((B)o2).j) 
		{
			if(((B)o1).hashCode() == ((B)o2).hashCode())
			{
						if(((B)o1).equals(o2))
				        {
							return 0;
						}
						else
							{
						       return ((B)o1).i - ((B)o2).i;
							}
						
			}
					else
					{
						return ((B)o1).i - ((B)o2).i;
					}
			}
			else
			{
				return ((B)o1).j - ((B)o2).j;
			}
		});
		set2.add(new B(10,20));
		set2.add(new B(110,220));
		set2.add(new B(110,220));
		set2.add(new B(110,220));
		set2.add(new B(110,220));
		set2.add(new B(101,220));
		set2.add(new B(110,220));
		set2.add(new B(10,201));
		set2.add(new B(0,230));
		set2.add(new B(100,20));
		set2.add(new B(90,20));
		set2.add(new B(210,270));
		System.out.println(set2);
	}
}
