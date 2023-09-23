package pack2_set;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeSet;
class C{
	int i,j,k;
	C(int i,int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString() {
		return "("+i+","+j+","+k+")";
	}
	public int hashCode() {
		return Integer.toString(i).hashCode() - Integer.toString(j).hashCode() - Integer.toString(k).hashCode();
    }	
	public boolean equals(Object o)
	{
		return o instanceof C && this.i == ((C)o).i && this.j == ((C)o).j && this.k == ((C)o).k;
	}
}
@SuppressWarnings({"unchecked","rawtypes","serial"})
class TreeSet3 extends TreeSet{
	/*
	 * @Constructor : Adding our own constructor for object creation.
	 */
	TreeSet3(){
		super();
	}
	/*
	 * @ParametrizedConstructor : Adding our own argument constructor for object,
	 * creation with our own comparator.
	 */
	TreeSet3(Comparator comparator){
		super(comparator);
	}
	/*
	 * @addMany : Built on top of add() method, to more than one value at a time.
	 */
	public boolean addMany(Object ... o1) {
		boolean flag = false;
		for(Object o2 : o1) {
			if (flag == true) add(o2);
			else flag = add(o2);
		}
		return flag;
	}
}
public class M22_TreeSet_vararg_add {
	public static void main(String[] args) {
		TreeSet3 set = new TreeSet3((o1,o2) -> {
			if(((C)o1).i == ((C)o2).i) {
				if(((C)o1).hashCode() == ((C)o2).hashCode()){
				if(((C)o1).equals(o2)) {
					return 0;
				}
				
				else {
					if(((C)o1).j == ((C)o2).j) {
						return ((C)o1).k - ((C)o2).k; 
					}
					else {
						return ((C)o1).j - ((C)o2).j; 
					}
				}
			}
			}
			else return ((C)o1).i - ((C)o2).i;
			return 1;
			
			});
		System.out.println(set.addMany(new C(2,3,4),new C(4,5,6),new C(6,5,4)));
		System.out.println(set.addMany(new C(3,4,5),new C(4,5,6),new C(4,5,6),new C(6,6,6)));
		System.out.println(set.addMany(new C(2,2,5),new C(4,5,6),new C(6,5,4),new C(10,9,9)));
		System.out.println(set);
		
	}
}