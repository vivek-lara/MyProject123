package pack1;
/*
 *  find out min value from the first half from a given int array?
 */
public class M23 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		int min = Integer.MAX_VALUE;
		
			for(int i = 0; i <array.length/2 ; i++)
			{
				if(array[i] < min)
				{
					min = array[i];
				}
			}
			System.out.println("min:"+ min);
		}
}
