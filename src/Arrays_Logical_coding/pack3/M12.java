package pack3;

import java.util.Arrays;

/*
 *  right rotate by one
 */
public class M12 {
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,4,7,8};
		System.out.println(Arrays.toString(arr));
		int temp =arr[arr.length-1];
		int temp1 = arr[arr.length-2];
		for(int i=arr.length-1; i>0;i--)
		{
			arr[i]=arr[i-1];
			arr[i-1]=arr[i-2];
		}
		arr[0]=temp;
		arr[1]=temp1;
		System.out.println(Arrays.toString(arr));
	}
}
