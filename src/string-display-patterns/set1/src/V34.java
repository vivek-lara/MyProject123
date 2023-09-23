class V34

{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		for (int i = s1.indexOf(' '); i <= s1.indexOf(' ',i+1) ; i++)
		{
			System.out.print(s1.charAt(i));
		
	     }
	}
}
class V34_1
{
	public static void main (String[]args)
	{
		String s1 = "ABC DEGH IJK LM N"; 
		int m = s1.indexOf(' ');
		int n = s1.indexOf(' ',m+1);
		for(int i = n; i <= s1.indexOf(' ',n+1); i++)
		{
			System.out.print(s1.charAt(i));
		}
   }
}

/*
    	int start = s1.indexOf(' ');
		int end = s1.indexOf(' ', start+1);

		for (int i = start; i <= end; i++)
		{
         System.out.println(s1.charAt(i));
		}
	*/

