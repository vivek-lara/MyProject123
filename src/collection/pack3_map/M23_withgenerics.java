package pack3_map;

import java.util.HashMap;

public class M23_withgenerics {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		HashMap<String, Integer>map2 = new HashMap<>();
		
		map1.put(2.3,100);
		map1.put("abc",true);
		map1.put('a',100);
		map1.put(40,'b');
		int i = (Integer)map1.get(40);
		System.out.println(i);
		
		map2.put("def", 12);
		map2.put("ef", 123);
		map2.put("f", 2);
		map2.put("rdef", 1);
		int j = map2.get("a");//here get method return type is integer and argument is string
		System.out.println("done");
	}

}
