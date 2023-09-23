package pack3;

import java.util.Arrays;

/*
 * multiply every even values with 20 and add unities to every odd values
 */
public class M4 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,12};
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			   arr[i]=arr[i]*20;
			}
			else
			{
				arr[i]=arr[i]+20;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
