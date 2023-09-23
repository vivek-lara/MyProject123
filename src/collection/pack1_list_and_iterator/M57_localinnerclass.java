package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Z1
{
	int i,j;
	public Z1(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + "," + j + ")";
	}
}
public class M57_localinnerclass {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		class A implements Comparator{
			 @Override
			public int compare(Object o1, Object o2) {
				return ((Z1)o1).i - ((Z1)o2).i;
			}
		}
		class B implements Comparator{
			@Override
			public int compare(Object o1, Object o2) {
				return ((Z1)o1).j - ((Z1)o2).j;
			}
		}
		ArrayList list = new ArrayList();
		list.add(new Z1(10,20));
		list.add(new Z1(101,210));
		list.add(new Z1(1022,220));
		list.add(new Z1(104,230));
		list.add(new Z1(110,220));
		list.add(new Z1(101,2022));
		System.out.println(list);
		Collections.sort(list,new A());
		System.out.println(list);
		Collections.sort(list,new B());
		System.out.println(list);
		  
	}

}
