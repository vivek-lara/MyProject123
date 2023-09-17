package pack3;
class A extends Thread
{
	public void run()
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		//a1.run();//here run method executing by main thread only not child thread 
		
	}
}