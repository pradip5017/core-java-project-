package Interview_BasicArrayQuestion;

import java.util.Scanner;

public class SwitchCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First number :");
		int a = sc.nextInt();
		
		System.out.print("Enter Secound Number :");
		int b = sc.nextInt();
		
		System.out.println("Enter Choice :");
		char op = sc.next().charAt(0);
//		int choice = sc.nextInt();
		
//		int result =0;
		
		
		switch(op)
		{
		case '+':
			System.out.println("Addition :"+(a+b));
			break;
			
		case '-':
			System.out.println("Subtraction :"+(a-b));
			break;
			
		case '*':
			System.out.println("Multiplication :"+(a*b));
		case '/':
			if(a !=0)
			
			System.out.println("Division :"+(a/b));
		
			else
			
				System.out.println("Defualt :");
				break;
		
			default :
			{
				System.out.println("Invalide Operator :");
			}
		
		}
				
	}

}
