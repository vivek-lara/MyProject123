package pack4_practice;

import java.util.HashMap;
import java.util.Set;

public class M3 {
		public static void main(String[] args) {
		HashMap<String, Integer>map = new HashMap<>();
		map.put("a",2);
		map.put("a1",3);
		map.put("a2",24);
		map.put("a3",2);
		Set<String> keys = map.keySet();
		for(String s1:keys)
		{
			System.out.println(s1+":"+map.get(s1));
		}
	}
}
