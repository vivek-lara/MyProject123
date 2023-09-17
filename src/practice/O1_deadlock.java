package practice;
class Util2
{
	public static void sleep(long millis)
	{
		try {
			Thread.sleep(millis);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
class P
{
	synchronized public void test1(P obj)
	{
		System.out.println("Thread1 begin:"+ Thread.currentThread().getName());
		Util2.sleep(1000);
		obj.test1(this);
		System.out.println("Thread1 end:"+ Thread.currentThread().getName());		
	}
	synchronized public void test2(P obj)
	{
		System.out.println("Thread2 begin:"+ Thread.currentThread().getName());
		Util2.sleep(1000);
		obj.test2(this);
		System.out.println("Thread2 end:"+ Thread.currentThread().getName());		
	}
}
class Thread31 extends Thread
{
  P p1,p2;
  Thread31(P p1 ,P p2) {
	this.p1 = p1;
	this.p2 = p2;
}
  @Override
	public void run() {
		p1.test1(p2);
	}
}
class Thread25 extends Thread
{
	P p1,p2;
	public Thread25(P p1, P p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	@Override
	public void run() {
		p2.test2(p1);
	}
}
public class O1_deadlock {
	public static void main(String[] args) {
		P p1 = new P();
		P p2 = new P();
		
		Thread31 t1 = new Thread31(p1,p2);
		t1.start();
		Util2.sleep(200);
		
		Thread25 t2 = new Thread25(p1,p2);
		t2.start();
		Util2.sleep(2000);
		
		System.out.println(t1.getState());
		Util2.sleep(1000);
		System.out.println(t2.getState());
		
		
	}

}
