package pack2;
/*
 * print the elements which are in the middle of two even elements
 */
public class M3 {
	public static void main(String[] args) {
  int[] arr = {1,2,3,4,5,6,7,8,9,11,12,22,23,24};
		
	    for(int i=0; i < arr.length - 2;i++)	
	    {
			if(arr[i]%2 == 0 && arr[i+2]%2 == 0 )
			{
				System.out.println(arr[i+1]);
			}
	   }
	}

}
