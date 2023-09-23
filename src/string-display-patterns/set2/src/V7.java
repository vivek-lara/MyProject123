class V7 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
	//	int i = 0;
		int j = s1.indexOf(' ');
		String s2 = s1.substring(0 , j);
		System.out.println(s2.length());
	}
}
