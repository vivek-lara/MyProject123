package pack3_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class M8_keySet_iterator {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 100);
		map.put("abc", 200);
		map.put("k1", 500);
		map.put("hello", 500);
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		Object obj;
		while(it.hasNext())
		{
			obj =it.next();
			System.out.println(obj+":"+map.get(obj));
		}
	}
}
