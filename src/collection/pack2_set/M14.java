package pack2_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class F 
{
	int i,j;
	F(int i,int j){
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode() + Integer.toString(j).hashCode();
    }
	
	public boolean equals(Object o)
	{
		return this.i == ((F)o).i && this.j == ((F)o).j;
	}
}

class TreeSet1 extends TreeSet
{
	  TreeSet1(Comparator comparator)
	  {
		 super(comparator);
	  }
	public boolean add1(Object... o1 ) 
	{
		int i = 0;
		for(Object o2 : o1) 
		{
			add(o2);
			i++;
		}
		if (i > 0)return true;
		else return false;
	}
	
}
public class M14{
	public static void main(String[] args) {
	TreeSet1 set = new TreeSet1((o1,o2)-> ((F)o1).i - ((F)o2).i);
		set.add1(new F(2,3),new F(4,5),new F(5,6));
		set.add1(new F(2,3),new F(4,5),new F(5,6));
		set.add1(new F(2,3),new F(4,5),new F(5,6));
		set.add1(new F(3,3),new F(5,5),new F(8,6));
	TreeSet1 set1 = new TreeSet1((o1,o2)-> ((F)o1).j - ((F)o2).j);
	    System.out.println(set);
		set1.add1(new F(2,3),new F(4,2),new F(5,6));
		set1.add1(new F(2,3),new F(4,2),new F(5,6));
		set1.add1(new F(2,3),new F(4,5),new F(5,6));
		System.out.println(set1);
		
	}

}
