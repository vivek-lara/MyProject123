package pack1_list_and_iterator;

import java.util.ArrayList;
import java.util.Scanner;

public class M41_scanner_containsmethod {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String s1;
	do
	{
		System.out.println("enter an element ");
		s1 = sc.next();
		if(!list.contains(s1))
		{
			list.add(s1);
		}
		else
		{
			System.out.println(s1+ "already added");
		}
		System.out.println("do u want to enter one more element?yes/no");
	}
	while("yes".equals(sc.next()));
	System.out.println("final list:" + list);
	}
}