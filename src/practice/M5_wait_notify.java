package practice;

class Thread3 extends Thread
{
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("wait on" + this + "begin by" + Thread.currentThread().getName());
			try
			{
			   this.wait();
			} 
			catch (InterruptedException ex) 
			{
				ex.printStackTrace();
			}
			System.out.println("wait on" + this + "end by" + Thread.currentThread().getName());
			
		}
	}
}
class Thread4 extends Thread
{
	Thread3 obj;
	Thread4(Thread3 obj)
	{
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		synchronized (obj) {
			System.out.println("notify on"+ obj + "begin by" + Thread.currentThread().getName());
			obj.notifyAll();
			System.out.println("notify on"+ obj + "end by" + Thread.currentThread().getName());
		}
	}
}
public class M5_wait_notify {
	public static void main(String[] args) throws InterruptedException {
		Thread3 t3 = new Thread3();
	    t3.start();
	    Thread3 t5 = new Thread3();
	    t5.start();
	    
	    Thread.sleep(10000);
	    System.out.println("main after 10 sec");
	    
        Thread4 t4 = new Thread4(t3);
        t4.start();
        
	 }    
}
