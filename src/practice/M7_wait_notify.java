package practice;
class I
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
	
}
class Thread7 extends Thread
{
	I i1;
	Thread7(I i1)
	{
		this.i1 = i1;
	}

	@Override
	public void run() {
		i1.test1();
	}
	
}
class Thread8 extends Thread
{
	I i1;
	Thread8(I i1)
	{
		this.i1 = i1;
	}
	@Override
	public void run() {
		i1.test1();
	}	
}
public class M7_wait_notify {
   public static void main(String[] args) throws InterruptedException {
	I obj1 = new I();   
//	I obj2 = new I();   

	Thread7 t2 = new Thread7(obj1);
	t2.start();
	
	Thread8 t1 = new Thread8(obj1);
	t1.start();
	
	
	Thread.sleep(2000);
	System.out.println("after sleeping 5sec main Thread");
	
	synchronized (obj1)
	{
		
			System.out.println("from test2 " + obj1 + "begin by" + Thread.currentThread().getName());
			obj1.notifyAll();
			System.out.println("from test2 " + obj1 + "end by" + Thread.currentThread().getName());
		
	}
	
 }
}
