package pack1;
/*
 * read all the elements in reverse order except first and last from given array
 */
public class M10 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i = array.length - 2;i >= 1;i--)
		{
			System.out.println(array[i]);
		}
	}

}
