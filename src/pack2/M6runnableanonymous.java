package pack2;

public class M6runnableanonymous {
	public static void main(String[] args) {
		 Thread t1 = new Thread(new Runnable() {
			public void run() {

				for(int i = 1; i < 1000; i++)
				{
					System.out.println(i);
				}
			}
		});
		 t1.start();
        for(int i = 1001; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
}
