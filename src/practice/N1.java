package practice;
class K extends Thread
{
	@Override
	public void run()
	{
		synchronized (this)
		{
			System.out.println("waiting on" + this + "begin by" +Thread.currentThread().getName());
			try 
			{
				this.wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("waiting on" + this + "end by" +Thread.currentThread().getName());
		}
	}

}
class L extends Thread
{
	K k1;
	L(K k1)
	{
		this.k1 = k1;
	}
	@Override
	public void run()
	{
		synchronized (k1) {
			System.out.println("notify on " + k1 +"begin by "+Thread.currentThread().getName());
			k1.notify();
			System.out.println("notify on " + k1 +"end by "+Thread.currentThread().getName());
		}
	}
}
public class N1 {
	public static void main(String[] args) throws InterruptedException {
		K t1 = new K();
		t1.start();
		
		Thread.sleep(5000);
		
		L l1 = new L(t1);
		l1.start();
	}

}
