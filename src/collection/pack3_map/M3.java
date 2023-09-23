package pack3_map;

import java.util.HashMap;

public class M3 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		System.out.println(map.put("abc",100));
		System.out.println(map);
		System.out.println(map.put("abc",200));
		System.out.println(map);
		System.out.println(map.put("abc",300));
		System.out.println(map);
		System.out.println(map.put("abc",400));
		System.out.println(map);
		
	}

}

 
 /*
 
 * if any element is storing successfully,then it returns null
 * here in second sop 100 is replacing with 200,means 100 is no more,hence 100 printing
 *in first line 100 is replacing null ,hence null is returning and printing in first sop.
 *in last line no one is replacing 400,hence 400 is not printing
*/