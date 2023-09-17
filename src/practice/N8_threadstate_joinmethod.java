package practice;
class D1 extends Thread
{
	Thread mainThread;
	D1(Thread mainThread)
	{
		this.mainThread = mainThread;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(mainThread.getState());
	}
}
public class N8_threadstate_joinmethod {
      public static void main(String[] args) throws InterruptedException {
		D1 d1 = new D1(Thread.currentThread());
		d1.start();
		d1.join();	
	}
}
