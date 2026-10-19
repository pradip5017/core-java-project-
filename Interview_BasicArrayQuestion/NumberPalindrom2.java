package Interview_BasicArrayQuestion;
// integer prime number for user
import java.util.*;
public class NumberPalindrom2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter prime number :");
		int num = sc.nextInt();
		int target = num;
		int rev = 0;
		
		while(num > 0)
		{
			rev = rev * 10+num %10;
			num = num / 10;	
		}
		if(target==rev)
		{
			System.out.println("True:"+target);
		}
		else
		{
			System.out.println("False:"+target);
		}
	}

}
