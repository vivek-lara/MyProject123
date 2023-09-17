package practice;
class F
{
	static void test1()
	{
		synchronized (F.class) 
		{
			for(int i=1; i<1000;i++)
			  {
				  System.out.println("from test1:"+ i +":"+Thread.currentThread().getName());
			  }
		}
	  
	}
    static void test2()
	{
	     synchronized (F.class) 
	     {
			for(int i=1; i<1000;i++)
			{
				System.out.println("from test2:"+ i +":"+Thread.currentThread().getName());
			}
	     }
	}
}	
class Thread1 extends Thread
{
	@Override
	public void run() {
		F.test1();
	}	
}
class Thread2 extends Thread
{
	@Override
	public void run() {
		F.test2();
	}	
}

public class M4_class_lock {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}
  
}
