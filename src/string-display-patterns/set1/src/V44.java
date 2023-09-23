class V44 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = s1.indexOf(' ');
		while (i >= 0)
		{
				System.out.print(s1.charAt(i));
				i--;
		}
	}
}
