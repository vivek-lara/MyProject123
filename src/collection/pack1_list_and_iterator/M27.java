package pack1_list_and_iterator;

import java.util.ArrayList;

public class M27 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		System.out.println(list);
		System.out.println(list.remove(1));
		//System.out.println(list.remove(Integer.valueOf(200)));
		System.out.println(list.remove(Integer.valueOf(500)));
		System.out.println(list);
	}

}
