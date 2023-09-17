package pack2;

public class M12_runnableanonymous {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<50; i++)
				{
					System.out.println(Thread.currentThread().getName()+"-"+i);
				}
				
			}
		});
		t1.start();
		t1.setName("child");
		for(int i=100; i<200; i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}

}
