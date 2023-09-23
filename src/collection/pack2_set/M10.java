package pack2_set;

import java.util.HashSet;

public class M10 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("abc"));
	    System.out.println(set);
		
	}

}
/*
 * in StringBuffer hashcode and equals method of Object class not overrided
 */
