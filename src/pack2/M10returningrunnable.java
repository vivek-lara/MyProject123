package pack2;

public class M10returningrunnable {
	static Runnable test1()
	{
		return new Runnable()
		{
			@Override
			public void run() 
			{
				for(int i = 1; i < 1000; i++)
				{
					System.out.println(i);
				}
				
			}
		};
	}
	static Runnable test2()
	{
		return ()-> {
			for(int i = 1001; i < 2000; i++)
			{
				System.out.println(i);
			}
		};
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(test1());
		t1.start();
		
		Thread t2 = new Thread(test2());
		t2.start();
	}
}
