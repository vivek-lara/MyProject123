package java8.pack1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class M9_collection_lambda {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(100,50,10,20,78,55);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l, (i,j)-> ((i > j)? -1 : (i < j)? 1 : 0));
		System.out.println(l);
		
	}

}
