package pack2_set;

import java.util.HashSet;

public class M3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println("adding status@1:"+set.add(10));
		System.out.println("content @1:"+ set);
		System.out.println("adding status@2:"+set.add(10));
		System.out.println("content @2:"+ set);
		System.out.println("adding status@3:"+set.add(100));
		System.out.println("content @3:"+ set);
		System.out.println("adding status@4:"+set.add(100));
		System.out.println("content @4:"+ set);
	
	}

}
//add method return type is a boolean
