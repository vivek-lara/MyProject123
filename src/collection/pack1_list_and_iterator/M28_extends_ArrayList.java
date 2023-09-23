package pack1_list_and_iterator;

import java.util.ArrayList;

public class M28_extends_ArrayList extends ArrayList {
	public static void main(String[] args) {
		M28_extends_ArrayList list = new M28_extends_ArrayList();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		list.add("mno");
		list.add("pqr");
		list.add("stu");
		
		System.out.println(list);
	//	System.out.println(list.remove("def"));
	//	System.out.println(list.remove("ekl"));
	//	System.out.println(list.remove(3));
	//	System.out.println(list.remove(4));
		list.removeRange(1,4);
		System.out.println(list);
	}

}
