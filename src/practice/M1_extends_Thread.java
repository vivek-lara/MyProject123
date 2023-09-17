package practice;


class A extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("first thread:"+" "+i);
		}
     }	
}
class B extends Thread
{
	@Override
	public void run()
	{
     for(int i=2000; i<=3000;i++)
     {
    	 System.out.println("second thread:"+" "+i);
     }
	}
}
public class M1_extends_Thread {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
		
		for(int i=3000;i<=4000;i++)
		{
			System.out.println("main thread:"+" "+i);
		}
	}

}
