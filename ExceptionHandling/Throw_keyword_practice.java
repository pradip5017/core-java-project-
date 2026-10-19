	package ExceptionHandling;
	
		class TrowsPractice {
		public static void checkEligibility(int age, int wt)
		{
			if(age>14 && wt<40)
			{
				System.out.println("You are Eligible for Addmision..!!");
			}
			
			else
			{
				throw new ArithmeticException("your are not Eligible for job..!!");
			}
			
			System.out.println("Addmision Process..!!");
			System.out.println("Thank you for Apply for this plaforms..!!");
		}
		
		}
		public class Throw_keyword_practice {
		public static void main(String args[])
		{
			System.out.println("Addtion Successfully..!!");
			
			TrowsPractice.checkEligibility(22, 30);
			
		}
	
	}
