class V6 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		int i = s1.lastIndexOf(' ');
		int j = s1.lastIndexOf(' ' , i - 1);
		String s2 = s1.substring(j+1, i);
		System.out.println(s2);
	}
}
