package pack3_map;

import java.util.HashMap;
import java.util.Set;

public class M9_entrySet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("hello", 500);
		Set entries = map.entrySet();
		for(Object obj : entries)
		{
			System.out.println(obj);
		}
	}

}
