package pack3_map;

import java.util.Comparator;
import java.util.TreeMap;

class C
{
	int i,j;
	C(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		
		return "("+i+","+j+")";
	}
}
   class SortBasedOnI implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			return ((C)o1).i - ((C)o2).i;
		}
	}
   class SortBasedOnJ implements Comparator
   {
	   public int compare(Object o1,Object o2)
	   {
		   return ((C)o1).j - ((C)o2).j;
	   }
   }
public class M18_comparator {
	public static void main(String[] args) {
		TreeMap map = new TreeMap(new SortBasedOnI());
		map.put(new C(1,1), "arg1");
		map.put(new C(2,1), "arg2");
		map.put(new C(2,1), "arg10");
		map.put(new C(2,2), "arg3");
		map.put(new C(3,3), "arg4");
		map.put(new C(3,2), "arg5");
		map.put(new C(3,1), "arg6");
		map.put(new C(1,4), "arg7");
		map.put(new C(10,5), "arg8");
		map.put(new C(5,10), "arg9");
		System.out.println(map);
		TreeMap map1 = new TreeMap(new SortBasedOnJ());
		map1.put(new C(1,1), "arg1");
		map1.put(new C(2,1), "arg2");
		map1.put(new C(2,2), "arg3");
		map1.put(new C(3,3), "arg4");
		map1.put(new C(3,2), "arg5");
		map1.put(new C(3,1), "arg6");
		map1.put(new C(1,4), "arg7");
		map1.put(new C(2,4), "arg7");
		map1.put(new C(10,5), "arg8");
		map1.put(new C(5,10), "arg9");
		map1.put(new C(5,7), "arg10");
		map1.put(new C(2,6), "arg11");
		map1.put(new C(5,0), "arg12");
		System.out.println(map1);
		
	}

}
