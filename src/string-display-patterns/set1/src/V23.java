class V23 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = s1.length()-10;
		do
		{
			System.out.print(s1.charAt(i));
			i++;
		}
		while (i < s1.length());
	}
}
