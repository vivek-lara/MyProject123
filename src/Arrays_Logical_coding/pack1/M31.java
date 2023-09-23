package pack1;

public class M31 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,0,11};
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		double avg = (double)sum/array.length;
		System.out.println("avg:"+avg);
	}

}
