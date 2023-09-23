package pack4_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class M4 {
	public static void main(String[] args) {
		HashMap<String, Integer>map = new HashMap<>();
		map.put("v3", 3);
		map.put("v2", 43);
		map.put("v1", 37);
		map.put("v4", 34);
		map.put("v41", 34);
		map.put("v39", 34);
		map.put("v54", 34);
		System.out.println(map);
		Set<String>keys = map.keySet();
		Iterator<String>it = keys.iterator();
		String s1;
		while(it.hasNext())
		{
			s1 = it.next();
			System.out.println(s1+":"+map.get(s1));
		}
	}

}
