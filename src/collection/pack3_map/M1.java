package pack3_map;

import java.util.HashMap;

public class M1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 35);
		map.put("abc", 35);
		map.put(35, "abc");
		map.put("key1", 315);
		map.put(34, true);
		map.put(314, "abc");
		map.put(134, "test");
		map.put(341, 'r');
		System.out.println(map);
	}

}

/*
 * in map put method first argument is a key and second arg is a value(key,value).
 * it can have any kind of key and any kind of value
 * hashMap does not maintain order of addition
 * map stream's main functionality is maintaining a key value
 */
