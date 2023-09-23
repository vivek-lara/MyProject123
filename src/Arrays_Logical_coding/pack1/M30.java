package pack1;

public class M30 {
	 public static void main(String[] args) {
			int[] array = {1,2,3,4,5,6,7,8,9,0,-1,-2};
			int min = Integer.MAX_VALUE;
			for(int i = 0;i < array.length;i++)
			{
				if(array[i] < min)
				{
					min = array[i];
				}
			}
			System.out.println("min value is:"+ min);
	 }
}
