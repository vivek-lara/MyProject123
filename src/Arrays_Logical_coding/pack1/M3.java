package pack1;
/*
 * read last 3 elements in the given array?
 */
public class M3 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,7,8,4,6,8};
		System.out.println(array[7]);
		System.out.println(array[8]);
		System.out.println(array[9]);
		//or
		System.out.println(array[array.length - 3]);
		System.out.println(array[array.length - 2]);
		System.out.println(array[array.length - 1]);
	}

}
