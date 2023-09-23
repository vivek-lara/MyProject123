package pack2_set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class M4_linkedhashset {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();//it provides order of addition with avoiding duplicates
		set.add(45);                           //wherever linked is in the name in all over collection api order of 
		set.add(10);                           //addition is preserving
		set.add(10000);
		set.add(10000);
		set.add(100);
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(1000);
		set.add(20);
		set.add(75);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(50);
		set.add(50);
		set.add(70);
		set.add(30);
		set.add(20);
		set.add(80);
		set.add(90);
		System.out.println(set);
	
	}

}
