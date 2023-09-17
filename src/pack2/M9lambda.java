package pack2;

public class M9lambda {
	public static void main(String[] args) {
	    new Thread(() -> {
			for(int i = 1; i < 1000; i++)
			{
				System.out.println(i);
			}
		}).start();
		
		for(int i = 1001; i < 2000; i++)
		{
			System.out.println(i);
		}
	}

}
