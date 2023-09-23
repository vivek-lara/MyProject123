package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class V
{
	int i,j;

	public V(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "(" + i + "," + j + ")";
	}
}
public class M58 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new V(1,2));
		list.add(new V(3,2));
		list.add(new V(4,5));
		list.add(new V(7,6));
		list.add(new V(9,8));
		list.add(new V(10,20));
		System.out.println(list);
		
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2) {
			     return ((V)o1).i - ((V)o2).i;
			}
		});
		System.out.println(list);
		
		Collections.sort(list, new Comparator(){
			public int compare(Object o1, Object o2) {
				return ((V)o1).j - ((V)o2).j;
			}
		});
		System.out.println(list);
		
		
	}

}
