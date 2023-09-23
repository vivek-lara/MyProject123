class V39 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = s1.indexOf(' ');
		int j = s1.indexOf(' ' ,i+1);
		do
		{
           System.out.print(s1.charAt(j));
		   j--;
		}
		while (j > i - 1);
	}
}
