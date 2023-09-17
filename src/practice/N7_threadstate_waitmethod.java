package practice;
class C1 extends Thread
{
	@Override
	public void run() {
		synchronized (this) {
			try {
				wait();
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}

public class N7_threadstate_waitmethod {
       public static void main(String[] args) throws InterruptedException {
		C1 c1 = new C1();
		c1.start();
		
		Thread.sleep(1000);
		System.out.println(c1.getState());
		
	}
}
