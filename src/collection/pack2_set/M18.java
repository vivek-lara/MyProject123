package pack2_set;

import java.util.HashSet;

class I
{
	int i;
	int j;
	I(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
	public int hashCode()
	{
		int hash = Integer.toString(i).hashCode();
		hash += Integer.toString(j).hashCode();
		System.out.println("hashCode for"+ this +"is"+hash);
		return hash;
	}
	public boolean equals(Object obj)
	{
		boolean flag = (obj instanceof I)&&
				       (i == ((I)obj).i) &&
				       (j == ((I)obj).j);
		System.out.println("equals b/w"+ this + "and"+ obj+"is"+flag);
		return flag;
	}
}
public class M18 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		I c1 = new I(10,50);
		I c2 = new I(10,50);
		I c3 = new I(50,10);
		I c4 = new I(50,10);
		I c5 = new I(100,500);
		I c6 = new I(100,500);
		I c7 = new I(500,100);
		I c8 = new I(500,500);
		I c9 = new I(500,100);
		System.out.println("adding status:"+c1+"is"+set.add(c1));
		System.out.println("adding status:"+c2+"is"+set.add(c2));
		System.out.println("adding status:"+c3+"is"+set.add(c3));
		System.out.println("adding status:"+c4+"is"+set.add(c4));
		System.out.println("adding status:"+c5+"is"+set.add(c5));
		System.out.println("adding status:"+c6+"is"+set.add(c6));
		System.out.println("adding status:"+c7+"is"+set.add(c7));
		System.out.println("adding status:"+c8+"is"+set.add(c8));
		System.out.println("adding status:"+c9+"is"+set.add(c9));
		System.out.println("final set:"+set);
		
	}
	

}
/*
 * hashcode is used for inequality
 */
