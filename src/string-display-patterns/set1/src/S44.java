class S44 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		String s2  = "";
		int i = s1.indexOf(' ') - 1;
	//int i = s1.indexOf(' ') ;
		while (i > -1)
		{
			s2 = s2 + s1.charAt(i);
			i--;
		}
		System.out.println(s2);
	}
}
