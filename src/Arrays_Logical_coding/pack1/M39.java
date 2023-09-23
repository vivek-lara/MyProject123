package pack1;

import java.lang.reflect.Array;

/*
 *  find out the continuous elements which are in the ascending/descending order?
 */
public class M39 {
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		
		int[] arr = {1,2,5,7,6,5,3,2,3,6,8,9,7,3,2,1,4,5};
		System.out.print(arr[0]+",");

			boolean asc=true, desc=true;
			for(int j =1; j+1 < arr.length ;j++) 
		{
	
			if( asc && arr[j - 1] < arr[j])
			{
				System.out.print(arr[j]+",");
				desc=false;
				asc=true;
			}
			else if(!desc)
			{
				System.out.println();
				System.out.print(arr[j]+",");
				desc=true;
				asc=false;
				continue;   
			}
			  if( desc && arr[j-1]> arr[j])
			 {
				 System.out.print(arr[j]+",");
				 desc = true;
				 asc = false;
			 }
			 else if(!asc)
			 {
				 System.out.println();
				 System.out.print(arr[j]+",");
				 asc = true;
				 desc=false;
			}
		}
	}
}
 


