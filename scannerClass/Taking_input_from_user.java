package scannerClass;

import java.util.Scanner;

//class Test
//{
//	int a;
//	double b;
//	float c;
//}
public class Taking_input_from_user {
	
	public static void main(String args[])
	{
		int a;
		double b; 
		float c;
		
		System.out.println("Enter the value of a(int) b,(double), c(float):");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextDouble();
		c = sc.nextFloat();
		
		System.out.println("Addtion is="+(a+b+c));
	}
}
