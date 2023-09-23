class V17 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = 0;
		while (i <= 9)
		{
			if (s1.charAt(i) != ' ')
			{
				System.out.print(s1.charAt(i));
			}
			i++;
		}
	}
}
