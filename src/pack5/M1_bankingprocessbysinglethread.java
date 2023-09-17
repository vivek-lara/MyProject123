package pack5;

import java.util.Scanner;

public class M1_bankingprocessbysinglethread {
	public static void main(String[] args)throws Exception   {
		Scanner scan = new Scanner(System.in);
		System.out.println("please Enter Your Account Number:");
		int an = scan.nextInt();
		System.out.println("Enter password:");
		int pwd = scan.nextInt();
		System.out.println("Enter the amount to be withdrawn:");
		int amount = scan.nextInt();
		Thread.sleep(5000);
		System.out.println("collect your money:");
		System.out.println("banking activity completed:");
		
		//System.out.println("do you want printing statement:");
		//int print = scan.nextInt();
		
		System.out.println("printing activity started.");
		for(int i=1; i<5; i++)
		{
			System.out.println("lara tech");
			Thread.sleep(5000);
		}
		System.out.println("printing activity completed:");
		
		System.out.println("adding activity started:");
		int a = 56;
		int b= 45;
		int c=a+b;
		Thread.sleep(5000);
		System.out.println("sum="+c);
		System.out.println("adding activity completed:");
	}

}
