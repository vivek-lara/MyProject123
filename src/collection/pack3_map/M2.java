package pack3_map;

import java.util.HashMap;

public class M2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 120);
		map.put("abc", 121);
		map.put("abc", 122);
		map.put("abc", 125);
		map.put("abc", 121);
		map.put("abc", 129);
		System.out.println(map);
	}

}
/*
 *in hashMap same key is replacing its value in every next line
 *key can not be duplicates in the hashMap and even in hole map section
 *it is also using hashCode and equals method internally for key duplication purpose 
 */
