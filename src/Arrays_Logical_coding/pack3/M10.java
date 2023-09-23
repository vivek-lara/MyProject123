package pack3;
/*
 * left rotate by 1
 * left rotate by 2
 */
import java.util.Arrays;

public class M10 {
	public static void main(String[] args) {
		int[] arr = {1,3,6,8,9,34};
		int temp=arr[0];
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}
}
