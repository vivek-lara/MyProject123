package pack1;
/*
 * find out max value from all even elements from a given int array?
 */
public class M33 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i]%2 == 0 && array[i]>max)
			{
				max = array[i];
			}
		}
		System.out.println("max:"+max);
	}

}
