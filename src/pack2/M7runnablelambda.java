package pack2;

public class M7runnablelambda {
	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i = 1; i < 1000; i++)
			{
				System.out.println(i);
			}
		};
		Thread t1 =new Thread(r);
		t1.start();
		
		for(int i = 1001; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
}
