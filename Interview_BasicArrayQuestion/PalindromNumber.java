package Interview_BasicArrayQuestion;

import java.util.*;

public class PalindromNumber {
	public static void main(String[] args) {
//		int num = 1233432;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = sc.nextInt();	
		int target = num;
		int rev = 0;
		
		while(num > 0)
		{
			rev = rev * 10 +num %10;
			num = num/ 10;
		}
		if(target == rev)
		{
			System.out.println("True :"+target);
		}
		else
		{
			System.out.println("False :"+target);
		}
		
	}

}
