package java8.pack1;


public class M8_lambda {
     public static void main(String[] args) {
    	 
		Runnable r = () ->{ for(int i = 1; i <= 10; i++)
				{
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
			        if(i % 2 == 0 )
			        {
					System.out.println(i+" is even");
			        }
			        else System.out.println(i +" is odd");
				} 
	    };
	    
	    Thread t = new Thread(r);
	    t.start();
	    
	}
}
