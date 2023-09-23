package java8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Fruits_predicate extends Thread{
	public static void main(String[] args) {
		ArrayList<String> al = new 	ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("eneter 10 fruits name:");
		for(int i=0; i<=9;i++)
		{
			al.add(scan.next());
		}
		for(String s:al) {
			System.out.println(s);
		}
		Predicate<String> p = s-> s.charAt(0)==65;
		System.out.println("fruits name starting with A are:");
		for(String a:al) {
			if (p.test(a))
			System.out.println(a);//code is incomplete
		}
	}

}
