class V5 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		int i = s1.lastIndexOf(' ');
		int j = s1.length()-1;
		String s2 = s1.substring( i+1 , j+1 );
		System.out.println(s2);
	}
}
class V5_1
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		int i = s1.lastIndexOf(' ');
		for (int j = i+1 ;  j <= s1.length()-1 ;  j++ )
		{
			System.out.print( s1.charAt(j) );
		}
	}
}
