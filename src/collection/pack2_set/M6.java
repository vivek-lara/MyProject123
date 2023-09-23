package pack2_set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i="+i;
	}
	public int compareTo(Object o)
	{
		return i - ((A)o).i;
	}
//	public int hashCode()
//	{
//		return Integer.toString(i).hashCode();
//	}
//	public boolean equals(Object obj)
//	{
//		return i == ((A)obj).i;
//	}
}
public class M6 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		//LinkedHashSet set = new LinkedHashSet();
		set.add(new A(100));
		set.add(new A(600));
		set.add(new A(200));
		set.add(new A(300));
		set.add(new A(400));
		set.add(new A(500));
		set.add(new A(100));
		set.add(new A(100));
		System.out.println(set);
	}

}
