 package pack3;

import java.util.Arrays;

/*
 * swap first element with last element.
 * swap every element with its net element
 */

public class M5 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i = 0; i<arr.length;i++)
		{
		       temp=arr[0]; 
		       arr[0]= arr[arr.length-1];
		       arr[arr.length-1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
