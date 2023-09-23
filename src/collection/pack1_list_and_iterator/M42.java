package pack1_list_and_iterator;

import java.util.ArrayList;

class C
{
	int i;
	int j;
	C(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "(i="+ i + ",j="+j+")";
	}
}
public class M42 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new C(90, 208));
		list.add(new C(910, 280));
		list.add(new C(9, 206));
		list.add(new C(920, 508));
		list.add(new C(903, 408));
		list.add(new C(901, 308));
		list.add(new C(4, 8));
		System.out.println(list);
	}

}
