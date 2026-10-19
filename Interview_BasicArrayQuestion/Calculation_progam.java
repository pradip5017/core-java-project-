package Interview_BasicArrayQuestion;

public class Calculation_progam {

	public static void main(String args[])
	{
		// calculation program
		

		        

		       
		        int a=10 ;
		        int b=20;

		        System.out.println("Additiions :"+(a+b));
		        System.out.println("Subtraction :"+(a-b));
		        System.out.println("Multiplciation :"+(a*b));
		        System.out.println("Division :"+(a/b));
		        
		        char op ='*';

		        switch(op) {
		            case '+':
		                System.out.println("Addition = " + (a + b));
		                break;

		            case '-':
		                System.out.println("Subtraction = " + (a - b));
		                break;

		            case '*':
		                System.out.println("Multiplication = " + (a * b));
		                break;

		            case '/':
		                if(b != 0)
		                    System.out.println("Division = " + (a / b));
		                else
		                    System.out.println("Cannot divide by zero!");
		                break;

		            default:
		                System.out.println("Invalid Operator");
		        }
				
	}
}
