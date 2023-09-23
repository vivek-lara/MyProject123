package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person
{
	String firstName;
	String lastName;
	int age;
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "(" + firstName + "," + lastName + "," + age + ")";
	}
}
public class M55 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("ajay","kumar",24));
		list.add(new Person("sanjai","kk",25));
		list.add(new Person("sisir","kumar2",34));
		list.add(new Person("ramu","kumar3",44));
		list.add(new Person("uday","kumar4",27));
		list.add(new Person("ram","kumar5",25));
		System.out.println(list);
		

	Collections.sort(list,new Comparator() {
			public int compare(Object o1, Object o2)
			{
				return ((Person)o1).firstName.compareTo(((Person)o2).firstName) ;
			}
	});
	System.out.println(list);
	
	Collections.sort(list,new Comparator() 
	{
		public int compare(Object o1, Object o2)
		{
			return ((Person)o1).lastName.compareTo(((Person)o2).lastName) ;
		}
	});
	System.out.println(list);
	
	Collections.sort(list,new Comparator() 
	{
		public int compare(Object o1, Object o2)
		{
			return ((Person)o1).age - ((Person)o2).age ;
		}
	});
	System.out.println(list);
		
	}

}
