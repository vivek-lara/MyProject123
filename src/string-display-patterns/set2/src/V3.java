class V3 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		int i = s1.indexOf(' ');
            int j = s1.indexOf(' ',i+1);
            String s2 = s1.substring(i+1,j);
	//	String s2 = s1.substring(i+1,s1.indexOf(' ',i+1));
		{
		System.out.println(s2);
		}
	}
}
