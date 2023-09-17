package pack3;
class E extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class M5 {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		E e1 = new E();
		e1.start();
		System.out.println("done");
	}
}
//here even though parent left from the execution still child is excuting 
//if thread is user thread it continues executing even though parent(main)left
//from the execution