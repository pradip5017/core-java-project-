package Interview_Question_practice;

  class Palindrome {
	
	public boolean isPallindrome(int x)
	{
		int temp = x;
		 int rem =0,rev=0;
		 
		 while(temp >0)
		 {
			 rem = temp%10;
			 rev=rev*10+rem;
			 temp = temp/10;
			 
		 }
		 if(rev==x)
		 {
			 return true;
		 }
		 else 
			 return false;
		
	}
	public static void main(String args[])
	{
		Palindrome p1 = new Palindrome();
//		p1.isPallindrome(0);
		
		System.out.println("Pelindrome = " +p1.isPallindrome(1));
	}

}
