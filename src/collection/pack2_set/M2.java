package pack2_set;

import java.util.HashSet;

public class M2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(100);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(40);
		set.add(50);
		set.add(50);
		set.add(60);
		System.out.println(set);
	}

}
