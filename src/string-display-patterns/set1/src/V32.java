class V32 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = 12;
		do
		{
			char c = s1.charAt(i);
			System.out.print(c);
			i--;
		}
		while (i >= 3);
	}
}
