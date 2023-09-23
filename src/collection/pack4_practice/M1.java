package pack4_practice;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class A
{
	int i,j;
	A(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() 
	{
		return "("+i+","+j+")";
	}
	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode()+ Integer.toString(j).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return i == ((A)obj).i && j == ((A)obj).j;
	}
}
class Sort1 implements Comparator
{
	public int compare(Object o1, Object o2) {
        return ((A)o1).i - ((A)o2).i ;	
     }
}
//class Sort2 implements Comparator
//	{
//		public int compare(Object o1, Object o2) {
//			return ((A)o1).j - ((A)o2).j ;	
//		}
//	}
public class M1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new A(2,2));
		set.add(new A(8,9));
		set.add(new A(18,19));
		set.add(new A(18,19));
		set.add(new A(19,18));
		set.add(new A(1,19));
		set.add(new A(18,2));
		set.add(new A(1,2));
		set.add(new A(3,2));
		set.add(new A(3,3));
		set.add(new A(3,4));
		set.add(new A(1,1));
		set.add(new A(1,2));
		System.out.println(set);
		
		
		TreeSet set2 = new TreeSet(new Sort1());//only comparator working here,hence we will get only sorted value
		set2.addAll(set);
		System.out.println(set2);
		
		}
   }
/*
 * if comparator is introducing anywhere in collection api hashcode and equals are not working,only sorting is happening 
 * in treeset and treemap , we can not avoid duplicates of elements of other class even if we override hashCode and equals 
 * method in that class,we can only avoid duplicates by calling hashCode and equals in main method.
 */
