package pack1;
/*
 * find out the continuous elements which are in the ascending/descending order?
 */
public class M38 {
	public static void main(String[] args) {
		int[] array = {1,5,6,9,7,5,3,4,5,8,5,4,3,7,8,9};
		boolean asc = true, desc = true;
		System.out.print(array[0]+ ",");
		for(int i = 1; i < array.length; i++)
		{
			if(asc && array[i - 1] < array[i])
			{
				System.out.print(array[i]+",");
				asc = true;
				desc = false;
			}
			else if(!desc)
			{
				System.out.println();
				System.out.print(array[i]+",");
				desc = true;
			    asc = false;
				continue;
			}
		 if(desc && array[i - 1] > array[i])
			{
				System.out.print(array[i]+",");
				asc = false;
				desc = true;
			}
		 else if(!asc)
		 {
			 System.out.println();
			 System.out.print(array[i]+",");
			 asc = true;
			 desc = false;
		 }
		}
	}

}
