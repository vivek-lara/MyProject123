package pack1;
/*
 * read alternate elements from the given array in reverse order
 */
public class M14 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i = array.length - 1; i >= 0; i = i - 2)
		{
			System.out.println(array[i]);
		}
	}

}
