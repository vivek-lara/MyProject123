package pack3;
/*
 *  swap every element with its net element
 */
import java.util.Arrays;

public class M6 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i = 0; i < arr.length-1;i +=2)
		{
			temp = arr[i];
			arr[i]= arr[i+1];
			arr[i+1]=temp;
			
		}
     System.out.println(Arrays.toString(arr));
	}
}
