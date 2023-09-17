package pack2;

public class M4 {
	public static void main(String[] args) {
		class F implements Runnable
		{
			@Override
			public void run() 
			{
				for(int i = 0; i<1000; i++)
				{
					System.out.println(Thread.currentThread().getName()+"-"+ i);
				}
			}
		}
		new  Thread(new Runnable() {
			public void run()
			{
				for(int i = 1; i < 1000; i++)
				{
					System.out.println(i);
				}
			}
		}).start();
		F f1 = new F();
		Thread t1 = new Thread(f1);
		t1.start();

		for(int i = 500; i<1000; i++)
		{
			System.out.println(i);
		}
	}
}
