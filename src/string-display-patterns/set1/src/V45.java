class V45 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = s1.indexOf(' ');
		do
		{
			System.out.print(s1.charAt(i));
			i--;
		}
		while (i > -1);
	}
}
