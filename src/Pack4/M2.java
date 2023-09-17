package Pack4;
class B
{
	synchronized void test()
	{
		Thread t1=Thread.currentThread();
		for(int i=1; i<=1000;i++)
		{
			
			System.out.println(t1.getName()+":"+i);
		}
	}
}
class Thread3 extends Thread
{
	B obj;
	Thread3(B obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test();
	}
}
class Thread4 extends Thread
{
	B obj;
	Thread4(B obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test();
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		Thread3 obj1 = new Thread3(b1);
		Thread4 obj2 = new Thread4(b1);
		obj1.start();
		obj2.start();
	}
}
/*
 *  synchronization is  object wise
 *  every object will have only one object lock
 *  if thread is calling a1.test(),it required object lock of a1
 *  object lock is nothing but a key of synchronized 
 *  data inaccuracy is only when one object and more than one thread
 *  if two diff objects are there no chance of data inaccuracy so no need 
 *  of synchronization
 * 
 */
