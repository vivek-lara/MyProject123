package pack4_practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M5 {
	public static void main(String[] args) {
		HashMap map  = new HashMap();
		map.put("k1", "hello");
		map.put("k2", 300);
		map.put("k3", "hello");
		map.put("k4", 4.5);
		map.put("k5", "hello");
		map.put("k6", true);
		Set entries = map.entrySet();
	    for(Object obj:entries)
		{
			System.out.println(obj);
		}
	}

}
