package Interview_BasicArrayQuestion;

import java.util.Scanner;

public class PrimeNumber4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
//		int num = 17;
		
		boolean prime = true;
		for(int i=2; i<num; i++)
		{
			if(num % i ==0)
			{
				prime = false;
				break;
			}
		}
		if(prime)
		{
			System.out.println(num+" prime ");
		}else
		{
			System.out.println(num+" not prime");
		}
	}
	
}