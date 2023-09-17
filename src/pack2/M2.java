package pack2;
class B implements Runnable
{
	@Override
	public void run() 
	{
		for(int i = 0; i<1000; i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.start();
		t2.start();
		t3.start();
		for(int i = 5000; i<6000; i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
/*
*by using one runnable object any no. of threads can be created
*by using currentThread() method we can execute current threads 
*/