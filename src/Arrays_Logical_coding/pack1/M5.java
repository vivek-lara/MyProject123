package pack1;
/*
 * read all the elements from a given array?
 */
public class M5 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for(int i=0; i<array.length - 1;i++)
		{
			System.out.print(array[i]);
			//System.out.print(i);
		}
		//or
		
		for(int i:array)
		{
			System.out.println(i);
		}
	}

}
