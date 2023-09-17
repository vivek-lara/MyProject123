package pack3;

public class M8 {
	public static void main(String[] args) {
		for(int i=0; i<=10;i++)
		{
			System.out.println(i);
			try 
			{
			 Thread.sleep(1000);	
			} 
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
//sleep method and currentThread method is a static method
//sleep,join,wait methods required interrupted exeception