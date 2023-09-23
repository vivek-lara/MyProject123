package pack4_practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class B implements Comparable 
{
	int i,j;
	B(int i, int j)
	{
		this.i= i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "("+i+","+j+")";
	}
	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode()+ Integer.toString(j).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return i == ((B)obj).i && j == ((B)obj).j;
	}
	@Override
	public int compareTo(Object o) {
		return i - ((B)o).i;
	}
//	class Sort1 implements Comparator
//	{
//		@Override
//		public int compare(Object o1, Object o2) {
//			
//			return ((B)o1).i - ((B)o2).i;
//		}
//	}
}
public class M2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new B(1,2), "abc1");
		map.put(new B(1,2), "abc2");
		map.put(new B(1,3), "abc3");
		map.put(new B(2,3), "abc4");
		map.put(new B(1,1), "abc5");
		map.put(new B(6,5), "abc6");
		map.put(new B(6,5), "abc7");
		map.put(new B(5,6), "abc8");
		System.out.println(map);
		
		//TreeMap map1 = new TreeMap(new B(1,2).new Sort1());
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}

}
