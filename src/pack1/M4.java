package pack1;
class F extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("loop1:"+ i);
		}
	}
}

public class M4 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.start();
		
		F f2 = new F();
		f2.start();
		
		F f3 = new F();
		f3.start();
		for(int i= 4000; i <5000;i++)
		{
			System.out.println(i);
		}
	}

}
