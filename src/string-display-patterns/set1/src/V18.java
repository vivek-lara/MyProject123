class V18 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = 0;
		do
		{
			if (s1.charAt(i) != ' ')
			System.out.print(s1.charAt(i));
			i++;
		}
		while (i <= 9);
	}
}
