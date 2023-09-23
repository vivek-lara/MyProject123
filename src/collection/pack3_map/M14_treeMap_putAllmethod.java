package pack3_map;

import java.util.HashMap;
import java.util.TreeMap;

public class M14_treeMap_putAllmethod {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(100,"test");
		map.put(0,"test1");
		map.put(121,"test2");
		map.put(151,"test3");
		map.put(1100,"test4");
		map.put(120,"test5");
		map.put(1001,"test6");
		map.put(10,"test7");
		map.put(10,"test8");
		System.out.println(map);
		
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}

}