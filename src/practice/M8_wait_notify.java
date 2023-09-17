package practice;
class J
{
	
	
}
class Thread9 extends Thread
{
	J j1;
	Thread9(J j1)
	{
		this.j1 = j1;
	}

	@Override
	public void run() {
		synchronized (j1) {
			System.out.println("from wait " + j1 + "begin by" + Thread.currentThread().getName());
			try 
			{
				j1.wait();
	        } 	
			catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}
			System.out.println("from wait " + j1 + "end by" + Thread.currentThread().getName());
		
		}
	}
	
}

public class M8_wait_notify {
   public static void main(String[] args) throws InterruptedException {
	J obj1 = new J();   
//	J obj2 = new J();   

	Thread9 t2 = new Thread9(obj1);
	t2.start();
	
	Thread9 t1 = new Thread9(obj1);
	t1.start();
	
	Thread9 t3 = new Thread9(obj1);
	t3.start();
	
	
	Thread.sleep(2000);
	System.out.println("after sleeping 5sec main Thread");
	
	synchronized (obj1) {

		System.out.println("from main " +obj1 + "begin by" + Thread.currentThread().getName());
		obj1.notifyAll();
		System.out.println("from main " + obj1 + "end by" + Thread.currentThread().getName());
	}
	
}
}
