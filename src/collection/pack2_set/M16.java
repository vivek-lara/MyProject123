package pack2_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class M16 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	ArrayList list = new ArrayList();	
	list.add(100);
	list.add(300);
	list.add(200);
	list.add(400);
	list.add(500);
	list.add(500);
	list.add(500);
	LinkedHashSet<Integer> set = new LinkedHashSet(list); 
	System.out.println(set);
	
	}

}
