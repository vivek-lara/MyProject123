package pack2;
/*
 * print two consecutive odd elements
 */
public class M9 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,12,22,26,23,25,24};
			 for(int i=0; i < arr.length -1 ;i++)	
			 {
				 if(arr[i]%2 != 0 && arr[i+1]%2 != 0 )
				 {
					 System.out.println(arr[i]+","+arr[i+1]);
				 }
			 }
	}
}
