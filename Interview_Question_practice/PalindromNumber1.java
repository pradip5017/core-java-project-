package Interview_Question_practice;

import java.util.Scanner;

public class PalindromNumber1 {
	public static void main(String args[])
	{
		int num = 121;
		
		int temp = num;
		int rev =0;
		
		while(num > 0)
		{
			rev = rev*10+num % 10;
			num = num / 10;
		}
		if(temp == rev)
		{
			System.out.println("prime :"+temp);
		}
		else
		{
			System.out.println("Not prime :"+temp);
		}
	}
}
