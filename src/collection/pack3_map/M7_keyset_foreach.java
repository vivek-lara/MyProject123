package pack3_map;

import java.util.HashMap;
import java.util.Set;

public class M7_keyset_foreach {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("hello", 500);
		Set keys = map.keySet();
		//System.out.println(map);
		for(Object obj:keys )
		{
			System.out.println(obj +":"+map.get(obj));
		}
	}
}
/*
 *we cannot use for each loop directly in map,we can use through set in hashMap 
 */
