package pack3_map;

import java.util.Hashtable;

public class M12_hashtable_nullvaluenotallowed {
	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		table.put("abc", "test");
		table.put("xyz", "false");
		table.put(null, "500");     //NullPointerException
		table.put("hello", null);  //NullPointerException
		System.out.println(table);
	}
}
/*
 *null cant be inserted in hashtable neither as a key nor as a value. 
 *hashtable is a synchronized whereas hashMap is non synchronized.
 */
