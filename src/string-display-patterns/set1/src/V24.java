class V24 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		for (int i = s1.length()-10; i <= s1.length()-1 ; i++ )      // i < s1.length() can be taken
		{
          System.out.print(s1.charAt(i));
		}
	}
}
