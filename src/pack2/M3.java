package pack2;


public class M3 {
	
	static class D implements Runnable
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
		class E implements Runnable
		{
			@Override
			public void run()
			{

				for(int i = 0; i<1000; i++)
				{
					System.out.println(Thread.currentThread().getName() +"-"+ i);
				}
				
			}
		}
		public static void main(String[] args) {
		M3 m = new M3();
		D d1 = new D();	
		E e1 = m.new E();
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(d1);
		t1.start();
		t2.start();
		t1.setName("child1");
		t2.setName("child2");
		for(int i = 1000; i<4000; i++)
		{
			System.out.println(i);
		}
		
	}

}
