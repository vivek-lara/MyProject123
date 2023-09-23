package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class M75 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);
		Iterator it = list.iterator(); //as we can not create an object to iterator,"it" referring to sub class  
		                               //of iterator interface that is AIC which is devloping in the body of 
		                              //iterator method body;
	}
}
