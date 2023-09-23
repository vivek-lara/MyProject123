package pack1;
/*
 * read first half of the elements from a given array in the reverse order
 */
public class M11 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i = (array.length/2)-1; i >= 0;i--)
		{
			System.out.println(array[i]);
		}
	}

}
