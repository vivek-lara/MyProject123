package pack1;
/*
 * read last half of the elements from array
 */
public class M8 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i = array.length/2; i < array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
