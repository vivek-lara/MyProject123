package java8.pack1;

import java.util.Set;
import java.util.TreeSet;

public class N1_treeset_lambda {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>((x,y) -> (x < y ) ? 1 : ((x > y)? -1 : 0));
		set.add(10);
		set.add(12);
		set.add(1);
		set.add(100);
		set.add(9);
		set.add(0);
		System.out.println(set);
		
	}
}
