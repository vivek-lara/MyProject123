/*find out the total no. of characters in the given string*/

class S1 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		//System.out.println(s1.length());
		System.out.println("Given string is: " + s1);
		int count = 0;
		for(int i = 0;i <= s1.length()-1; i++)
		{
			count++;
		}
		System.out.println("Length of string: " + count);
	}
}




