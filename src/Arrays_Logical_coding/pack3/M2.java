package pack3;

import java.util.Arrays;

/*
 *  decrement every value to 10 unites
 */
public class M2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length;i++)
		{
		  arr[i] = arr[i]-10;
		}
		System.out.println(Arrays.toString(arr));
	}
}
