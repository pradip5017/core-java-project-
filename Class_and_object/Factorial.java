package Class_and_object;
import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		int number;
		System.out.println("Enter the number=");
		Scanner sc = new Scanner(System.in);
		 number =sc.nextInt();
		int answer = factorial(number);
		System.out.println("Factorial of "+ number +" is "+ answer);
		
		
	}
		static int factorial(int n)
		{
			if(n ==1);
			return 1;
		}

}
