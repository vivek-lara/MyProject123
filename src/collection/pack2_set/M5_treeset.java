package pack2_set;

import java.util.TreeSet;

public class M5_treeset {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(100);
		set.add(100);
		set.add(101);
		set.add(90);
		set.add(1);
		set.add(1001);
		set.add(100);
		set.add(15);
		System.out.println(set);
	}

}
/*
 * avoiding duplicates and also do sorting
 */