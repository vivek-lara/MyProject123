package pack2_set;

import java.util.Comparator;
import java.util.TreeSet;

class L
{
	int i,j,k;
	L(int i, int j,int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString()
	{
		return "("+i+","+j+","+k+")";
	}	
//	public int hashCode()
//	{
//		return Integer.toString(i).hashCode() + Integer.toString(j).hashCode() + Integer.toString(k).hashCode();
//	}
	
	public boolean equals(Object obj)
	{
		return i == ((L)obj).i && j == ((L)obj).j && k == ((L)obj).k;
	}
	
}
class TreeSet5 extends TreeSet
{
	TreeSet5(){
		super();
	}
	TreeSet5(Comparator comparator)
	{
		super(comparator);
	}
	
	public boolean add1(Object ... o1)
	{
		int i = 0;
		for(Object o2: o1)
		{
			add(o2);
			i++;
		}
		if (i <= 0)return false;
		else return true;
	}
}
public class M19 {
	public static void main(String[] args) {
		TreeSet5 set = 	new TreeSet5((o1,o2)->{ 
			if(((L)o1).i== ((L)o2).i) {
				if(((L)o1).hashCode() == ((L)o2).hashCode()) {
					if(((L)o1).equals(o2)) {
						return 0;
					}
					else if(((L)o1).j ==((L)o2).j) {
						return ((L)o1).k - ((L)o2).k;
					}
					else {
						return ((L)o1).j - ((L)o2).j;
					}
				}
				if(((L)o1).j ==((L)o2).j) {
					return ((L)o1).k - ((L)o2).k;
				}
				else {
					return ((L)o1).j - ((L)o2).j;
				}
			}
			else return ((L)o1).i - ((L)o2).i;
			
		});
		set.add1(new L(3,4,5),new L(4,5,6),new L(4,5,6),new L(6,4,5));
		set.add1(new L(2,2,5),new L(4,5,6),new L(6,5,4),new L(10,9,9));
		set.add1(new L(5,2,2),new L(1,1,1),new L(1,1,1),new L(10,9,9),new L(1,2,7),new L(1,2,3),new L(1,2,6));
		System.out.println(set);
//		TreeSet1 set1 = new TreeSet1((o1,o2)-> ((L)o1).j - ((L)o2).j  );
//		set1.add1(new L(3,4,5),new L(4,5,6),new L(4,5,6),new L(6,4,5));
//		set1.add1(new L(0,0,0),new L(4,0,4),new L(4,0,6),new L(26,24,25));
//		set1.add1(new L(3,2,1), new L(1,2,3),new L(1,2,3),new L(16,14,15));
//		System.out.println(set1);
//		for (Object o : set1) {
//			System.out.println(((L)o).hashCode());
//		}
		
		
//		for (Object o : set1) {
//			System.out.println(((L)o).hashCode());
//		}
		
//		TreeSet1 set2 = new TreeSet1((o1,o2)-> ((L)o1).k - ((L)o2).k  );
//		set2.add1(new L(7,4,5),new L(7,5,6),new L(7,5,6),new L(8,4,5));
//		
//		System.out.println(set);
//		System.out.println(set1);
//		for (Object o : set1) {
//			System.out.println(((L)o).hashCode());
//		}
		
		
	}

}
