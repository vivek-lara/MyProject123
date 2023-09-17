package practice;
class B1 extends Thread
{
	@Override
	public void run() {
       
        try {
			Thread.sleep(10000);
		} 
        catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
public class N6_threadstate_sleepmethod {
     public static void main(String[] args) throws InterruptedException {
		B1 b1 = new B1();
		b1.start();
		
		Thread.sleep(2000);
		System.out.println(b1.getState());
	}
}
