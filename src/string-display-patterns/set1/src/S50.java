class S50
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DE FGHI";
		int i = s1.length() - 1;
		while (i >= 0)
		{
			System.out.println(s1.charAt(i));
			i = i - 2;
		}
	}
}
