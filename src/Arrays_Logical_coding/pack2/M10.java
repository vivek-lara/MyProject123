package pack2;
/*
 * print three elements which are first 2's sum is third one
 */
public class M10 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,1,8,9,11,12,22,26,23,25,24};
			 for(int i=0; i < arr.length -2 ;i++)
			 {
				 if(arr[i]+arr[i+1]== arr[i+2]) 
				 {
                   	System.out.println(arr[i]+","+arr[i+1]+","+arr[i+2]);			 
				 }
			 }
	}
}
