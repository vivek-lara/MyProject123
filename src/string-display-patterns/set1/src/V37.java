class  V37
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int i = s1.indexOf(' ');
		for (int j = s1.indexOf(' ',i+1); j >= s1.indexOf(' ') ; j--)
		//for (int j = s1.indexOf(' ',i+1); j >= i ; j--)
		{
		 System.out.print(s1.charAt(j));
		}
	}
}
class V37_1
{
	
	public static void main (String[]args)
	{
		String s1 = "ABC DEGH IJK LM N";
		int m = s1.indexOf(' ');
		int n = s1.indexOf(' ',m+1);
		for(int i = s1.indexOf(' ',n+1); i > n - 1; i--)
		{
		System.out.print(s1.charAt(i));
		}
	}
}


