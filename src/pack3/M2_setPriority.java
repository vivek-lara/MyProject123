package pack3;

class B extends Thread
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
public class M2_setPriority {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		main.setPriority(10);
		B b1 = new B();
		b1.start();	
	}
}
//priority can be changed any between 1 to 10 only,otherwise it will give exception