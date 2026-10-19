	package ExceptionHandling;
	
	//throw keyword is used to explicitely throw userdefined/custom exception in the program
	//Sport registration system     age> 12 ,wt< 40
	
	
	
	//throw=> generate userdefine exception,    throws =>is used to declare the exception => method signature
	//int a;
	
	
	
	//using try catch we can handle Runtime(unchecked) exception
	
	//using throws we can handle Compile time(checked)
	
	class ThrowDemo{
		
		public static void checkEligibility(int age, int wt)
		{
			if(age>12 && wt<40)
			{
				System.out.println("You are Eligible for sport registratraion");
			}
		else
			
		{
			throw new ArithmeticException(" Sorry..!!!  You are not Eligible for addmiiton ");// stop of the line is called as throw
		}
			System.out.println("Reg process end .. thank you");
			System.out.println("welcome to the aplication");
		
		}
	
	}
	public class Throw_keyword {
	public static void main(String[] args) {
		
		System.out.println("***Sport reg process");
		
		ThrowDemo.checkEligibility(14,37);
		
	}
	}
