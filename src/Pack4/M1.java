package Pack4;
class A
{
	 void test()
	{
		for(int i=1; i<=1000;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
class Thread1 extends Thread
{
	A obj;
	Thread1(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test();
	}
}
class Thread2 extends Thread
{
	A obj;
	Thread2(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test();
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		Thread1 obj1 = new Thread1(a1);
		Thread2 obj2 = new Thread2(a1);
		obj1.start();
		obj2.start();
	}

}
/*
 *
 * one object shared to multiple threads
 * by using synchronization we avoid to enter more than one thread into 
 * a shared object at a time.
 * to avoid data inaccuracy we need synchronization.
 * we can share same object to n no. of threads
 * synchronization can be achieved by using keyword synchronized
 * synchronization is a object wise

 */
