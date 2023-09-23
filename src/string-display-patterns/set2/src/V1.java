class V1 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
	    int words = 0;
		int i = s1.indexOf(' ');
	    while (i != -1)
	    {
			words++;
			i = s1.indexOf(' ', i+1);
	    }
		System.out.print(words+1);
	}
}

class V1_1
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
	     int words = 1;
		//int i = s1.indexOf(' ');
	    for (int i = s1.indexOf(' ') ;  i != -1 ; i = s1.indexOf(' ',i+1) )
	    {
			words++;
	    }
		System.out.print(words);
		
	}
}
