package pack2;

public class M14_extendsthread_lambda {
	public static void main(String[] args) {
		Thread t1 = new Thread(()-> {
			for(int i=1; i<50; i++)
			{
				System.out.println(Thread.currentThread().getName()+"-"+i);
			}
		});
		t1.start();
		t1.setName("child");
		for(int i=100; i<150; i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}

}
