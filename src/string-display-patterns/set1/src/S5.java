/*Print the last character from the given string*/

class S5
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		System.out.println("Given string is: " + s1);
		int i = s1.length() - 1;
	/*	char lastChar = s1.charAt(i);
		System.out.println(lastChar); */
		System.out.println(s1.charAt(s1.length() - 1));
	}
}




