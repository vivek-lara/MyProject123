package pack2;

public class M15_newthread_lambda {
	public static void main(String[] args) {
		new Thread(() -> {
			for(int i=1; i<10; i++)
			{
				System.out.println(Thread.currentThread().getName()+"-"+i);
			}
		}).start();
		
		for(int i=100; i<151; i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		
	}

}
