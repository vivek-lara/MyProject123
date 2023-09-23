package pack1;
/*
 * find out 2nd max from a given int array?
 * find out 2nd min from a given int array?
 * find out 3rd max from a given int array?
 * find out 3rd min from a given int array?
 * find out the continuous elements which are in the ascending/descending order?
 */
public class M36 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int max = Integer.MIN_VALUE;
		int max1 = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i]>max)
			{
				max = array[i];
			}
			
		}
		
		for(int j = 0; j < array.length; j++)
		{
			if (array[j]>max1 && max != array[j]) 
				
				{
					max1 = array[j];
				}
			
		}
	
	
		System.out.println("max1:"+max1);
	}
}



