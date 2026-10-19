package Interview_BasicArrayQuestion;
//prime number
import java.util.*;
public class PrimeNumber1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number :");
		int limit = sc.nextInt();
		
		for(int num=2; num<=limit; num++)
		{
			boolean prime = true;
			
			for(int i=2; i<num; i++)
			{
				if(num %i ==0)
				{
					prime = false;
					break;
				}
			}
			if(prime)
			{
				System.out.print(num+" ");
			}
		}
		sc.close();
	}

}
