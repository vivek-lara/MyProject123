package pack2_set;

import java.util.HashSet;
import java.util.TreeSet;

class O
{
	int i,j,k;
	O(int i,int j,int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString()
	{
		return "("+i+","+j+","+k+")";
	}
	public int hashCode()
	{
		
		return Integer.toString(i).hashCode()+Integer.toString(j).hashCode()+Integer.toString(k).hashCode();
	}
	public boolean equals(Object o)
	{
		boolean b1=(o instanceof O && i == ((O)o).i && j == ((O)o).j && k == ((O)o).k) ;
		System.out.println("equals b/w" + this+ "and" + o+"is"+b1);
		return b1;
	}
}
public class M21 {
	public static void main(String[] args) {
		
		O n1 = new O(4,3,2);
		O n2 = new O(4,3,2);
		O n3 = new O(4,3,2);
		O n4 = new O(5,2,3);
		O n5 = new O(4,3,3);
		O n6 = new O(5,6,7);
		O n7 = new O(4,9,8);
		O n8 = new O(4,9,8);
		O n9 = new O(4,3,8);
		O n10 = new O(4,3,2);
		O n11 = new O(4,3,2);
		HashSet set = new HashSet();
		System.out.println("adding status of(n1)"+n1+"is:"+set.add(n1));
		System.out.println("adding status of (n2)"+n2+"is:"+set.add(n2));
		System.out.println("adding status of (n3)"+n3+"is:"+set.add(n3));
		System.out.println("adding status of (n4)"+n4+"is:"+set.add(n4));
		System.out.println("adding status of (n5)"+n5+"is:"+set.add(n5));
		System.out.println("adding status of (n6)"+n6+"is:"+set.add(n6));
		System.out.println("adding status of (n7)"+n7+"is:"+set.add(n7));
		System.out.println("adding status of (n8)"+n8+"is:"+set.add(n8));
		System.out.println("adding status of (n9)"+n9+"is:"+set.add(n9));
		System.out.println("adding status of (n10)"+n10+"is:"+set.add(n10));
		System.out.println("adding status of (n11)"+n11+"is:"+set.add(n11));
		
		System.out.println(set);
				
	}

}
