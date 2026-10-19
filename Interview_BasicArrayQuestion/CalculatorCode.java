package Interview_BasicArrayQuestion;
import java.util.*;
public class CalculatorCode {

	public static void main(String[] args) {
		
//		int a =10;
//		int b =20;
//		
//		System.out.println("Calculation Program : ");
//		System.out.println("Addition number :"+(a+b));
//		System.out.println("Subtraction :"+(a-b));
//		System.out.println("Multiplication :"+(a*b));
//		System.out.println("Divisiont :"+(a/b));
		
		int  a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Fist Number :");
		a = sc.nextInt();
		
		System.out.println("Enter Secound Number :");
		b = sc.nextInt();
		
		System.out.println("Enter Operator (+,-,*,/):");
		char op = sc.next().charAt(0);
		
		int result =0;
		
		if(op == '+')
		{
			result = a+b;
		}
		else  if(op == '-')
		{
			result = a-b;
		}
		else if(op== '*')
		{
			result = a*b;
		}else if(op == '/')
		{
			result = a/b;
		}
		System.out.println("Result :"+result);
				
	}
}
