package pack3;

import java.util.Arrays;

/*
 * right shift by one
 * right shift by two
 * right rotate by one
 * right rotate by two
 * 
 */
public class M11 {
	public static void main(String[] args) {
		int[] arr = {1,3,6,8,9,17};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i =arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		System.out.println(Arrays.toString(arr));
	}
}