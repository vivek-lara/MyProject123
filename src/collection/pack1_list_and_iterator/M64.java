package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Collections;

class Person1
{
	String firstName;
	String lastName;
	Person1(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		}
	@Override
	public String toString() {
		return "(" + firstName + "," + lastName + ")";
	}
	
}
public class M64 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person1 ("abhi","sanju"));
		list.add(new Person1 ("sbhi","vanju"));
		list.add(new Person1 ("tbhi","aanju"));
		list.add(new Person1 ("aahi","ranju"));
		list.add(new Person1 ("kbhi","vanju"));
		System.out.println(list);
		Collections.sort(list,(p1,p2)-> ((Person1)p1).firstName.compareTo(((Person1)p2).firstName));
		System.out.println(list);
		Collections.sort(list,(p1,p2)-> ((Person1)p1).lastName.compareTo(((Person1)p2).lastName));
		System.out.println(list);
	}

}
