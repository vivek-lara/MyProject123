package java8.pack1;

import java.util.TreeSet;
//pass a reverse comparator to treeSet via lambda expression
public class N3_reverse_comparator_lambda {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>((astr,bstr) -> bstr.compareTo(astr));
		set.add("A");
		set.add("D");
		set.add("N");
		set.add("T");
		set.add("B");
		set.add("F");
		set.add("C");
		set.add("K");
		set.add("A");
		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>((aInt,bInt) -> bInt.compareTo(aInt));
		set1.add(300);
		set1.add(100);
		set1.add(500);
		set1.add(200);
		set1.add(600);
		set1.add(400);
		set1.add(300);
		System.out.println(set1);
	}

}
