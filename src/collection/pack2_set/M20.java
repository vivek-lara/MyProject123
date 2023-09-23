package pack2_set;

import java.util.TreeSet;

class N
{
	int i,j;
	N(int i,int j)
	{
		this.i = i;
		this.j = j;
		//this.k = k;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode()+Integer.toString(j).hashCode();
	}
	public boolean equals(Object o)
	{
		return (i == ((N)o).i && j == ((N)o).j) ;
	}
}
public class M20 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet((o1,o2)-> ((N)o1).i - ((N)o2).i);
		set.add(new N(2,3));
		set.add(new N(2,3));
		set.add(new N(2,3));
		set.add(new N(3,2));
		set.add(new N(3,2));
		set.add(new N(3,3));
		set.add(new N(3,3));
		set.add(new N(4,3));
		set.add(new N(4,3));
		set.add(new N(4,4));
		set.add(new N(4,5));
		set.add(new N(5,4));
		set.add(new N(2,3));
//		set.add(new N(4,3,2));
//		set.add(new N(2,3,4));
//		set.add(new N(2,4,3));
//		set.add(new N(5,5,6));
//		set.add(new N(5,5,6));
//		set.add(new N(2,3,6));
//		set.add(new N(2,3,8));
//		set.add(new N(2,3,8));
//		set.add(new N(2,3,4));
		System.out.println(set);
				
	}

}
