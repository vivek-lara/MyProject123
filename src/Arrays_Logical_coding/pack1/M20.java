package pack1;
/*
 * find out the avg of the second half of the elements of the given array
 */
public class M20 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		{
			int sum = 0;
			for(int i = array.length/2; i <array.length ; i++)
			{
				sum = sum + array[i];
			}
			double avg = (double)sum/(array.length/2);
			System.out.println("avg:"+avg);
		}
	}
}
