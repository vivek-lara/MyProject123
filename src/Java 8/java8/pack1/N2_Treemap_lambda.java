package java8.pack1;

import java.util.TreeMap;

public class N2_Treemap_lambda {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>((a,b) -> (a>b) ? -1 : (a<b) ? 1 : 0);
		map.put(1, "gabbar");
		map.put(2, "jack");
		map.put(4, "max");
		map.put(1, "tiger");
		map.put(3, "jackie");
		System.out.println(map);
		TreeMap<Integer, String> map1 = new TreeMap<>();
		map1.putAll(map);
		System.out.println(map1);
	}

}
