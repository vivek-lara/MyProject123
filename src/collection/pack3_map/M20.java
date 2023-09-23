package pack3_map;

import java.util.Comparator;
import java.util.TreeMap;

class D
{
	int i,j;
	D(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		
		return "("+i+","+j+")";
	}
}
public class M20 {
	public static void main(String[] args) {
	
	class Sort1 implements Comparator
	{
	 @Override
	public int compare(Object o1, Object o2) {
		
		return ((D)o1).i - ((D)o2).i;
	}
}
	 class Sort2 implements Comparator
	 {
		 @Override
		 public int compare(Object o1, Object o2) {
			 
			 return ((D)o1).j - ((D)o2).j;
		 }
	}
		TreeMap map = new TreeMap(new Sort1());
		map.put(new D(1,2), "a");
		map.put(new D(2,1), "a1");
		map.put(new D(5,7), "a2");
		map.put(new D(3,2), "a3");
		map.put(new D(6,3), "a4");
		map.put(new D(7,2), "a5");
		map.put(new D(100,2),"a6");
		map.put(new D(99,5), "a7");
		map.put(new D(99,2), "a8");
		System.out.println(map);
		TreeMap map1 = new TreeMap(new Sort2());
		map1.put(new D(1,2), "a");
		map1.put(new D(2,2), "a");
		map1.put(new D(2,1), "a1");
		map1.put(new D(5,7), "a2");
		map1.put(new D(3,2), "a3");
		map1.put(new D(6,3), "a4");
		map1.put(new D(7,2), "a5");
		map1.put(new D(100,2),"a6");
		map1.put(new D(99,5), "a7");
		map1.put(new D(99,2), "a8");
		System.out.println(map1);
	}

}
