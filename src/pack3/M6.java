package pack3;

class F extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		F f1 = new F();
		f1.setDaemon(true);
		f1.start();
		System.out.println("done");
	}
}
//here as soon as parent thread is leaving child thread is also leaving
//daemon thread depends on parent thread