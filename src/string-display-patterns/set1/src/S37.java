class S37 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		String s2 = "";
		//int k = s1.indexOf(' ');
		for(int i = s1.indexOf (' ')+1; i <s1.indexOf(' ',i+1) ; i++)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		for(int j = s2.length() - 1; j >= 0 ; j--)
		{
			System.out.println(s2.charAt(j));
		}
	}
}
