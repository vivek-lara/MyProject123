package pack3_map;

import java.util.Comparator;
import java.util.TreeMap;

class E
{
	String Subject;
	E(String Subject)
	{
		this.Subject = Subject;
	}
	@Override
	public String toString() {
		
		return ""+Subject;
	}
}
public class M21_comparator_anonymous {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeMap map = new TreeMap(new Comparator() {
		public int compare(Object o1,Object o2) {
		return  ((E)o1).Subject.compareTo(((E)o2).Subject);
			}});
		map.put(new E("maths"), 90);
		map.put(new E("English"), 85);
		map.put(new E("Science"), 81);
		map.put(new E("art"), 92);
		map.put(new E("Physics"), 91);
		map.put(new E("Chemistry"), 88);
		System.out.println(map);
	}

}
