package Interview_BasicArrayQuestion;
import java.util.*;
public class CalculatorProgram {
	public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.println("\nChoose Operation:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.println("4. Division (/)");
	        
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();

	        int result = 0;

	        switch (choice) {

	            case 1:
	                result = a + b;
	                System.out.println("Addition = " +result);
	                break;

	            case 2:
	                result = a - b;
	                System.out.println("Subtraction = " + result);
	                break;

	            case 3:
	                result = a * b;
	                System.out.println("Multiplication = " + result);
	                break;

	            case 4:
	                if (b != 0)
	                    System.out.println("Division = " + (a / b));
	                else
	                    System.out.println("Cannot divide by zero!");
	                break;

	            default:
	                System.out.println("Invalid Choice!");
	        }

	        sc.close();
	    }
	}