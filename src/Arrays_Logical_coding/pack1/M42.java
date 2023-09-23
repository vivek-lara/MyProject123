package pack1;
/*
 * find out the 3rd min max from a given int array?
 */
public class M42 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,-1,-2,-3,67};
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(min1 > arr[i])
			{
				min1 = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(min2 > arr[i] && min1 != arr[i])
			{
				min2 = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(min3 > arr[i] && min2 != arr[i] && min1 != arr[i])
			{
				min3 = arr[i];
			}
		}
		System.out.println("3rd min value is:"+ min3);
	}

}
