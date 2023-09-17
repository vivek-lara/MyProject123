package pack3;

class G extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
public class M7 {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		G g1 = new G();
		g1.start();
		try 
		{
			g1.join();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//here main is resuming after g1 got finished,main is joining after the end of child thread