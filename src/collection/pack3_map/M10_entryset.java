package pack3_map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M10_entryset {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("heloo", 500);
		Set entries = map.entrySet();
		Entry entry;
		for(Object obj : entries)
		{
			entry = (Entry)obj;
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
