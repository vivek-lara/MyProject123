package pack3_map;

import java.util.LinkedHashMap;

public class M13_linkedhashmap {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put("abc1", 100);
		map.put("abc2", 200);
		map.put("abc3", 300);
		map.put("abc4", 100);
		map.put("gef", 400);
		map.put(123, 500);
		map.put(5.5, 520);
		map.put("h", 5.20);
		map.put("test", 600);
		map.put('a', 700);
		System.out.println(map);
	}
}
//linkedHashMap preserves the order of insertion 
