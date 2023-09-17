package pack2;

public class M13_runnable_lambda {
	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i=1; i<500; i++)
			{
				System.out.println(Thread.currentThread().getName()+"-"+i);
			}
		};
		Thread t1 = new Thread(r);
		t1.setDaemon(true);
		t1.start();
	//	t1.setDaemon(true); //we can set daemon thread only before start() method
		t1.setName("child");
		
		for(int i=1000; i<1010; i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}

}
//daemon thread executes till the end of execution of main thread, once main thread execution ends,daemon 
//thread will also stop even its task does not got over while user thread is independent of execution 
//of main thread  i.e it will complete given task.