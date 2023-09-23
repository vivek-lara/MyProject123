package pack3_map;

import java.util.HashMap;

public class M6_nullvalues {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 300);
		map.put(null, 1300);
		System.out.println(map);
	}

}
/*
 *key should have only one null value while values can have any no. of null values 
 */
