package Interview_BasicArrayQuestion;

public class NumberPalindrom01 {
	
	public static void main(String args[])
	{
		int num = 1234;
		int target = num;
		int rev=0;
		
		while(num > 0)
		{
			rev = rev * 10 + num/10;
			num = num /10;
		}
		if(target == rev)
		{
			System.out.println("True:"+target);
		}
		else
		{
			System.out.println("False:"+target);
		}
	}

}
