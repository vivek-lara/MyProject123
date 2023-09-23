class V35 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = s1.indexOf(' ');
		while (i <= s1.indexOf(' ',i+1))
		{
			System.out.print(s1.charAt(i));
			i++;
		}
	}
}
