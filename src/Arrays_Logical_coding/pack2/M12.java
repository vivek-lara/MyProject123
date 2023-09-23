package pack2;

public class M12 {
	public static void main(String[] args) {
		int[] arr = {6,7,1,2,3,14,5,6,7,1,8,9,11,12,22,26,23,25,24};
	      	for(int i = 1; i<arr.length - 1;i++)
	      	{
	      		
	      		if(arr[i]-arr[i-1]<arr[i]-arr[i+1])
	      		{
	      			System.out.println(arr[i-1]);
	      		}
	      		else if(arr[i]-arr[i-1]>arr[i]-arr[i+1])
	      		{
	      			System.out.println(arr[i+1]);
	      		}
	      		else
	      		{
	      			System.out.println(arr[i+1]+","+arr[i-1]);
	      		}
	      		
	      		for(int j = 1; j<arr.length-1;j++)
	      		{
	      			if(arr[i]-arr[j]<arr[i]-arr[j+1])
	      			{
	      				//System.out.println(i+":"+arr[j]);
	      			}
	      			else if(arr[i]-arr[j]>arr[i]-arr[j+1])
	      			{
	      				System.out.println(i+":"+arr[j+1]);
	      			}
	      			else 
	      			{
	      				System.out.println(i+":"+arr[j+1]+","+arr[j]);
	      			}
	      			
	      		}
	      }
	}
}
