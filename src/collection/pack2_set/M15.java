package pack2_set;

import java.util.ArrayList;
import java.util.HashSet;

class G
{
	int i,j;
	G(int i,int j)
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
		return Integer.toString(i).hashCode()+Integer.toString(j).hashCode();
	}
	public boolean equals(Object o)
	{
		return i == ((G)o).i && j == ((G)o).j;
		
	}
	
}
public class M15 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new G(2,3));
		set.add(new G(2,3));
		set.add(new G(6,1));
		set.add(new G(6,1));
		set.add(new G(3,3));
		set.add(new G(3,3));
		set.add(new G(3,3));
		set.add(new G(4,3));
		set.add(new G(4,3));
		set.add(new G(2,3));
		set.add(new G(3,2));
		set.add(new G(3,2));
		System.out.println(set);
	}
	

}
