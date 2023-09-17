package pack3;

class C extends Thread
{
	public void run()
	{
		for(int i = 1; i< 10;i++)
		{
		Thread t1 = Thread.currentThread();
	//	System.out.println(t1.getId()+"-"+i);
		System.out.println(t1.getName()+"-"+i);
	//	System.out.println(t1.getPriority()+"-"+i);
	//	System.out.println(t1.isDaemon()+"-"+i);
		System.out.println("-------------------------");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}
public class M3_changeThreadName{
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		main.setPriority(8);
        C c1 = new C();
		c1.setName("t1");//changing the name of child thread
		c1.start();
		//c1.setPriority(4);
		System.out.println("done");
	//	System.out.println("------------------");
		C c2 = new C();
	    c2.setName("t2");
	    c2.setPriority(7);
	    c2.start();
	
	}
}
