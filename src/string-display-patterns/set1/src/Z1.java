class  Z1
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGHI JKL MN";
/*		int m = s1.indexOf(' ');
		int n = s1.indexOf(' ', m+1) ;
		int k = s1.indexOf(' ', n+1);  */
		 for (int i = 0;  i <= 9 ; i++ )
		 {
			 if (s1.charAt(i) != ' ')
			 {
				 System.out.print(s1.charAt(i));
			 }
			 
		 }
	 }
}
