package pack2_set;

import java.util.TreeSet;


public class M23 {
	public static void main(String[] args) {
	TreeSet<Integer> set = new TreeSet<>();
	set.add(1);
	set.add(7);
	set.add(3);
	set.add(2);
	set.add(5);
	System.out.println(set);
	TreeSet<Integer> set1 = new TreeSet<Integer>((x,y)-> (x>y)?-1 :((x<y)?1:0)) ;
	set1.addAll(set);
	System.out.println(set1);
	}
}
