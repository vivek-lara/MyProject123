package practice;
class Thread21 extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 500; i++)
		{
			System.out.println(i);
			Thread.currentThread().yield();
		}
		
	}
}
class Thread22 extends Thread
{
	@Override
	public void run() {
		for(int i = 1000; i <= 2000; i++)
		{
			System.out.println(i);
			Thread.currentThread().yield();
		}
		
	}
}
public class N9_threadstate_yieldmethod {
	public static void main(String[] args) {
		Thread21 t1 = new Thread21();
		t1.start();
		
		Thread22 t2 = new Thread22();
		t2.start();
	}

}
