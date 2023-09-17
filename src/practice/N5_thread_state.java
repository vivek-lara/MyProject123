package practice;
class A1 extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		super.run();
	}
}
public class N5_thread_state {
	public static void main(String[] args) throws InterruptedException {
		A1 a = new A1();
	    a.setName("child");
	    System.out.println("a1:"+ a.getState());
	    
	    a.start();
	    System.out.println("a2:"+ a.getState());
	    
	    Thread.sleep(6);
	    System.out.println("a3:"+ a.getState());
	    
	    Thread.sleep(5000);
	    System.out.println("a4:"+ a.getState());
	    
	}

}
