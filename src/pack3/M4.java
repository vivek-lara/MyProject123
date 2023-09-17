package pack3;

class D extends Thread
{
	D(String s1)
	{
		super(s1);
	}
	public void run()
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class M4{
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
        D d1 = new D("hello");
		d1.start();
		System.out.println("done");
	}
}
