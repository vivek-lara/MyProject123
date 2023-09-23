package pack3_map;

import java.util.HashMap;
import java.util.TreeMap;

class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "("+i+")";
	}
	public int compareTo(Object o)
	{
		return i - ((A)o).i;
	}
}
public class M16_comparable {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new A(10), "2.5");
		map.put(new A(11), "2.5");
		map.put(new A(102), "2.5");
		map.put(new A(5), "2.5");
		map.put(new A(2), "2.5");
		map.put(new A(9), "2.5");
		//System.out.println(map);
		
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}
}
