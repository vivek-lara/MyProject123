package practice;
class Thread11 extends Thread
{
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("from wait "+ this + "begin by "+ Thread.currentThread().getName());
			try 
			{
				this.wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("from wait "+ this + "end by "+ Thread.currentThread().getName());
		}
	}
	
}
public class M9_wait_notify {
	public static void main(String[] args) throws InterruptedException {
		Thread11 t11 = new Thread11();
		t11.start();
		Thread11 t12 = new Thread11();
		t12.start();
		Thread11 t13 = new Thread11();
		t13.start();
	
		Thread.sleep(2000);
		System.out.println("after 2sec sleep of main thread:");
		
		synchronized (t11) {
			System.out.println("from main " + t11 + "begin by "+Thread.currentThread().getName());
			t11.notify();
			System.out.println("from main " + t11 + "end by "+Thread.currentThread().getName());
		}
		synchronized (t12) {
			t12.notify();
		}
		synchronized (t13) {
			t13.notify();
		}
		
	}

}
