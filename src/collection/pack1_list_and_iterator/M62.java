package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class Q
{
	int p,q;
	Q(int p,int q)
	{
		this.p = p;
		this.q = q;
	}
	@Override
	public String toString() {
		return "(" + p + "," + q + ")";
	}
	
}
public class M62 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Q(10,100));
		list.add(new Q(101,1001));
		list.add(new Q(120,1002));
		list.add(new Q(210,100));
		list.add(new Q(310,120));
		list.add(new Q(410,150));
		
		Collections.sort(list,(o1,o2)-> ((Q)o1).p - ((Q)o2).p);
		System.out.println(list);
		Collections.sort(list,(o1,o2)-> ((Q)o1).q - ((Q)o2).q);
		System.out.println(list);
	}

}
