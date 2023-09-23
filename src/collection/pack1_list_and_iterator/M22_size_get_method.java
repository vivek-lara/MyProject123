package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Arrays;

public class M22_size_get_method {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) {
	        ArrayList list1 = new ArrayList();
			list1.add("abc");
			list1.add("xyz");
			list1.add("hello");
			list1.add("test");
			list1.add("java");
			list1.add("btm");
			list1.add("html");
			list1.add("spring");
			list1.add("js");
			//System.out.println(list1);
			System.out.println(list1.size());
			for(int i = 0; i < list1.size();i++)
			{
				//list1.get(i);
			  System.out.print(list1.get(i)+", "); //print values without array
			}
			//System.out.println(list1);//print values in array form
		}
}
