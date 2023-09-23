package pack1;
/*
 * find out sum of all the int elements in the given array?
 */
public class M15 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		{
			int sum = 0;
			for(int i = 0; i < array.length; i++)
			{
				sum += array[i];
			}
			System.out.println("sum:"+sum);
		}
	}

}
