package Interview_BasicArrayQuestion;

import java.util.Scanner;

public class SwitchCalculator1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Fist number :");
		int a = sc.nextInt();
		
		System.out.print("Enter secound Number :");
		int b = sc.nextInt();
		
		System.out.print("Enter Choice :");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case '+':
			System.out.println("Additions :"+(a+b));
			
		case '-':
			System.out.println("Subtraction :"+(a-b));
			
		case '*':
			System.out.println("Multiplication :"+(a*b));
			
		case '/':
			if(b!=0)
			System.out.println("Division :"+(a/b));
			else
				System.out.println("Can not dividec..!!");
			
			break;
			
			default :
				System.out.println("Invalide :");
				
		}
	}

}
