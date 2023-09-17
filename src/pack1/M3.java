package pack1;
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("loop1:"+ i);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println("loop2:"+ i);
		}
	}
}
class D extends Thread
{
	public void run()
	{
		for(int i=201;i<=300;i++)
		{
			System.out.println("loop3:"+ i);
		}
	}
}

public class M3 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		C c1 = new C();
		c1.start();
		D d1 = new D();
		d1.start();
	}
	

}
