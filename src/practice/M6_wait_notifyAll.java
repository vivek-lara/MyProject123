package practice;
class H
{
	synchronized void test1()
	{
		
			System.out.println("from test1 " + this + "begin by" + Thread.currentThread().getName());
			try 
			{
				this.wait();
	        } 	
			catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}
			System.out.println("from test1 " + this + "end by" + Thread.currentThread().getName());
		
	}
	synchronized void test2()
	{
		
			System.out.println("from test2 " + this + "begin by" + Thread.currentThread().getName());
			this.notifyAll();
			System.out.println("from test2 " + this + "end by" + Thread.currentThread().getName());
		
	}
}
class Thread5 extends Thread
{
	H h1;
	Thread5(H h1)
	{
		this.h1 = h1;
	}

	@Override
	public void run() {
		h1.test1();
	}
	
}
class Thread6 extends Thread
{
	H h1;
	Thread6(H h1)
	{
		this.h1 = h1;
	}
	@Override
	public void run() {
		h1.test1();
	}	
}
public class M6_wait_notifyAll {
   public static void main(String[] args) throws InterruptedException {
	H obj1 = new H();   
//	H obj2 = new H();   

	Thread6 t2 = new Thread6(obj1);
	t2.start();
	
	Thread5 t1 = new Thread5(obj1);
	t1.start();
	
	
	Thread.sleep(2000);
	System.out.println("after sleeping 5sec main Thread");
	
	obj1.test2();
	
}
}
