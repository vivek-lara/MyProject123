class V50 
{
	public static void main(String[] args) 
	{
		String s1 = "ABC DEGH IJKLMN";
		int mid = s1.length()/2;
		int i = s1.indexOf(' ');
		int j = s1.indexOf(' ' ,i+1);
     	if ((mid - i) > (j - mid))  
		{
			System.out.print(j);
		}
		else   
		{     
			System.out.print(i);
		}     
	}
}
