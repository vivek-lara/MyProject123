package Pack4;
class C
{
	static  synchronized void test()
	{
		Thread t1=Thread.currentThread();
		for(int i=1; i<=1000;i++)
		{
			System.out.println(t1.getName()+":"+i);
		}
	}
}
class D extends Thread
{
	public void run()
	{
		C.test();
	}
}
class E extends Thread
{
	public void run()
	{
		C.test();
	}
}
public class M3 {
	public static void main(String[] args) {
		D d1 = new D();
		E e1 = new E();
		d1.start();
		e1.start();
	}
}
/*
 *  every class will have only one class lock,if there is static synchronized test method
 */
