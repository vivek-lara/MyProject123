package pack1;
/*
 * find out the sum of second half of the elements in the given array
 */
public class M19 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		{
			int sum = 0;
			for(int i =array.length/2 ; i < array.length ; i++)
			{
				sum += array[i];
				System.out.println("sum:"+sum);
			}
		}
   }
}