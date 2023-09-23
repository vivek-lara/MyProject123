package pack1;
/*
 * find out 2nd min from the given array?
 */
public class M40 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]< min)
			{
				min = arr[i];
			}
		}
		int min1 = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length;i++)
		{
			if(arr[i]< min1 && arr[i]!= min)
			{
				min1 = arr[i];
			}
		}
		System.out.println("2nd min is:"+ min1);
	}

}
