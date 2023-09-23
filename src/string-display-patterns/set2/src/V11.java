class V11 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		for (int i = s1.lastIndexOf(' '); i <= s1.length() - 1 ; i++ )
		{
			System.out.print(s1.charAt(i));
		}
	}
}