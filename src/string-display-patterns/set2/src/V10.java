class V10 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC XYZ TEST HELLO";
		int i = s1.lastIndexOf(' ');
		int j = s1.length()-1;
		String s2 = s1.substring(i+1,j+1);
		System.out.println(s2.length());
	}
}
