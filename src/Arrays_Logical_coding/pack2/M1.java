package pack2;
/*
 * print the elements which are next to even elements
 * print the elements which are previous to even elements
 * print the elements which are in the middle of two even elements
 * print the odd elements which are in the middle of two even elements
 * print the even elements which are in the middle of two odd elements
 * print two consecutive even elements
 * print two consecutive odd elements
 * print three elements which are first 2's sum is third one
 * 
 * 
 */
public class M1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,12,22,23,0};
		
	    for(int i=0; i < arr.length;i++)	
	    {
			if(arr[i]%2 == 0 && i+1 < arr.length )
			{
				System.out.println(arr[i+1]);
			}
		}
	}
}
