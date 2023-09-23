package pack1;
/*
 * find out the 3rd max max from a given int array?
 */
public class M37 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int i = 0;i < array.length; i++)
		{
			if(max1 < array[i])
			{
				max1 = array[i];
			}
		}
		for(int i = 0; i < array.length; i++)
		{
			if(max2 < array[i] &&  max1 != array[i])
			{
				max2 = array[i];
			}
		}
		for(int i = 0; i < array.length; i++)
		{
			if(max3 < array[i] &&  max1 != array[i] && max2 != array[i]  )
			{
				max3 = array[i];
			}
		}
		System.out.print("3rd max value is:"+ max3);
	}

}
