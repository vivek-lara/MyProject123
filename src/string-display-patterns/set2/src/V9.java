class V9 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		int i = s1.indexOf(' ');
		int j = s1.indexOf(' ', i+1);
		int k = s1.indexOf(' ', j+1);
		String s2 = s1.substring( j+1 , k);
		System.out.println(s2.length());
	}
}
