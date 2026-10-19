package Interview_Question_practice;

public class PalindromNumber {
	public static void main(String args[])
	{
		 int num =121;
		 
		 int temp =num;
		 int rev =0;
		 
		 while(num > 0)
		 {
			 rev = rev * 10 + num % 10; 
			 num =num /10;
		 }
		 
		 if(temp == rev)
		 {
			 System.out.println("True :"+temp);
		 }
		 else {
			 System.out.println("False :"+temp);
		 }
				 
	}
	
}


