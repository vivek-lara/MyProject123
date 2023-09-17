package pack1;

public class M8 {
	public static void main(String[] args) {
		new Thread() {
			public void run()
			{
				for(int i = 1; i < 1000; i++)
				{
					System.out.println(i);
				}
			}
		}.start();
		
		
		for(int i = 2000; i < 3000; i++)
		{
			System.out.println(i);
		}
	}
}
