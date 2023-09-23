package pack1;
/*
 * find out the continuous elements which are in the ascending/descending order?
 */
public class M41 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,5,4,7,8,9,3,111,150,121,108,99};
		System.out.print(arr[0]+",");
		System.out.print(arr[1]+",");
		for(int i = 2; i < arr.length; i++)
		{
		    if(arr[i-1] < arr[i-2] && arr[i-1]<arr[i])
	         {
	        	 System.out.println();
	        	 System.out.print(arr[i]+",");
	         }
			 else if(arr[i-1] < arr[i])
			{
				System.out.print(arr[i]+",");
			}
			else if(arr[i-1]> arr[i-2]&& arr[i-1]>arr[i])
			{
				System.out.println();
				System.out.print(arr[i]+",");
				continue;
			}
			
			else if(arr[i-1]>arr[i])
			{
				System.out.print(arr[i]+",");
			}
		}
	}
}
