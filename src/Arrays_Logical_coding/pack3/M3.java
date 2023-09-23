package pack3;

import java.util.Arrays;

/*
 * increment first half values with 5 unites and decrement 2nd half values with 10 unites
 */
public class M3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,12};
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length;i++)
		{
			if(i<arr.length/2)
			{
				 arr[i] = arr[i]+5;
				
			}
			else
			{
				arr[i] = arr[i]-10;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
