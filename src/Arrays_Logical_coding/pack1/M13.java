package pack1;
/*
 * read alternate elements from a given array?
 */
public class M13 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i = 0; i < array.length - 1; i = i+2)
		{
			System.out.println(array[i]);
		}
	}

}
