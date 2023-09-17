package pack2;

public class M8lambda {
	public static void main(String[] args) {
	    Thread t1 =new Thread(() -> {
			for(int i = 1; i < 1000; i++)
			{
				System.out.println(i);
			}
		});
		t1.start();
		
		for(int i = 1001; i < 2000; i++)
		{
			System.out.println(i);
		}
	}

}
