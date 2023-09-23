package pack2;
/*
 *  find out all the three elements whos sum is zero.
 */
public class M5 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,-1,-2,-3,-4,-5,-6,0};
		for(int i = 0;i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++) {
				
				for(int k = 0; k<arr.length; k++)
				if(arr[i]+arr[j]+arr[k] == 0 )
				{
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}		
		}
	 }
  }
}
