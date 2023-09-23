package pack3;

import java.util.Arrays;

/*
 * reverse array element
 */
public class M7 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i=0; i<arr.length/2;i++)
		{
			temp = arr[i];
			arr[i]= arr[arr.length - i - 1];
			arr[arr.length - i - 1]=temp;
		}
	  System.out.println(Arrays.toString(arr));
	}
}
