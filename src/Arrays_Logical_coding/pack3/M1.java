package pack3;

import java.util.Arrays;

/*
 * increment every value to 5 unites
 * decrement every value to 10 unites
 * increment first half values with 5 unites and decrement 2nd half values with 10 unites
 * multiply every even values with 20 and add unities to every odd values
 */
public class M1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length;i++)
		{
		  arr[i] = arr[i]+5;
		}
		System.out.println(Arrays.toString(arr));
	}
}
