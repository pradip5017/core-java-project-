package Interview_BasicArrayQuestion;

import java.util.Scanner;

public class NumberPalindrom1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		
		int num = sc.nextInt();
//		int num =12321;
		int target =num;
		int rev =0;
		
		while(num >0)
		{
			 rev = rev * 10 +num % 10;
			 
			 num = num / 10;
		}
		if(target==rev)
		{
			System.out.println("True : "+target);
		}else
		{
			System.out.println("False :"+target);
		}
	}

}
