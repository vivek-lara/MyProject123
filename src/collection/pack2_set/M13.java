package pack2_set;

import java.util.HashSet;

class E
{
	int i;
	E(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "("+i+")";
	}
	public int hashCode()
	{
		//return i;
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj)
	{
		return i == ((E)obj).i;
	}
}
public class M13 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new E(10));
		set.add(new E(10));
		set.add(new E(20));
		set.add(new E(20));
		set.add(new E(10));
		set.add(new E(30));
		set.add(new E(30));
		set.add(new E(50));
		set.add(new E(60));
		set.add(new E(80));
		set.add(new E(70));
		set.add(new E(90));
		set.add(new E(100));
		set.add(new E(1));
		set.add(new E(5));
		set.add(new E(1000));
		set.add(new E(10000));
		System.out.println(set);
	}

}
