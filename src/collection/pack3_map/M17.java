package pack3_map;

import java.util.TreeMap;

class B implements Comparable
{
	
	String s1;
	B(String s1)
	{
		this.s1 = s1;
	}
	public String toString()
	{
		return "("+s1+")";	
	}
	@Override
	public int compareTo(Object o) {
		
		return s1.compareTo(((B)o).s1) ;
	}
}
public class M17 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(new B("ajai"), "10 marks");
		map.put(new B("ram"), "20 marks");
		map.put(new B("kumar"), "5 marks");
		map.put(new B("shiva"), "12 marks");
		map.put(new B("chinmay"), "2 marks");
		map.put(new B("vikash"), "18 marks");
		System.out.println(map);
	}

}
