package pack1;
/*
 * find out min value from all odd elements from a given int array?
 */
public class M34 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i]%2 != 0 && array[i]<min)
			{
				min = array[i];
			}
		}
		System.out.println("min:"+min);
	}

}
