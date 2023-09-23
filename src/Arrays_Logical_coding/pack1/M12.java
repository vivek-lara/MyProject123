package pack1;
/*
 * read last half of the element from given array in reverse order
 */
public class M12 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i = array.length - 1; i > (array.length/2)-1;i--)
		{
			System.out.println(array[i]);
		}
	}

}
