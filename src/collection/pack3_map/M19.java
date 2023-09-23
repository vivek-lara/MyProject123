package pack3_map;

import java.util.Comparator;
import java.util.TreeMap;

import pack3_map.ClassOne.SortBasedOnrollnumber;

class ClassOne
{
	
	int rollnumber;
	ClassOne(int rollnumber)
	{
		
		this.rollnumber = rollnumber;
	}
	@Override
	public String toString() {
		
		return "("+rollnumber+")";
	}
class SortBasedOnrollnumber implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		return ((ClassOne)o1).rollnumber - ((ClassOne)o2).rollnumber ;
	}
}
}
public class M19 {
	public static void main(String[] args) {
		//ClassOne c1 = new ClassOne(10);
		TreeMap map = new TreeMap(new ClassOne(1).new SortBasedOnrollnumber() );
		map.put(new ClassOne(1), "ram");
		map.put(new ClassOne(4), "shiv");
		map.put(new ClassOne(7), "vam");
		map.put(new ClassOne(2), "ram");
		map.put(new ClassOne(9), "krish");
		map.put(new ClassOne(10), "pam");
		map.put(new ClassOne(3), "mili");
		map.put(new ClassOne(5), "gili");
		System.out.println(map);
	}

}
