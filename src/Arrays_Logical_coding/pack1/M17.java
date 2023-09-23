package pack1;
/*
 * find out sum of the first half of the elements in the given array?
 */
public class M17 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		{
			int sum = 0;
			for(int i = 0; i < array.length/2 ; i++)
			{
				sum += array[i];
				System.out.println("sum:"+sum);
			}
		}
	}
}
