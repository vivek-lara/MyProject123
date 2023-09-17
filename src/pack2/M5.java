package pack2;

public class M5 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run(){
				for(int i = 1; i < 1000; i++)
				{
					System.out.println(i);
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
