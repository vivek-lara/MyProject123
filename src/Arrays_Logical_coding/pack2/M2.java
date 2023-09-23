package pack2;
/*
 *  print the elements which are previous to even elements
 */
public class M2 {
	public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7,8,9,11,12,22,23,0};
		
	    for(int i=0; i < arr.length;i++)	
	    {
			if(arr[i]%2 == 0 && i+1 < arr.length)
			{
				System.out.println(arr[i-1]);
			}
	   }

	}
	
}
