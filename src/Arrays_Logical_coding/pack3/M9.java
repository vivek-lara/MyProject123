package pack3;
/*
 * left shift by one
 * left shift by two
 */
import java.util.ArrayList;
import java.util.Arrays;

public class M9 {
	public static void main(String[] args) {
		int[] arr = {1,3,6,8,9,34};
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
	}
}


