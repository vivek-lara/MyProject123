package pack3;

import java.util.Arrays;

/*
 * replace array elements with the index numbers
 */
public class M8 {
	public static void main(String[] args) {
		int[] arr = {3,6,8,9,34};
		System.out.println(Arrays.toString(arr));
		int temp;
		for(int i = 0;i < arr.length;i++)
		{
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
	}

}
