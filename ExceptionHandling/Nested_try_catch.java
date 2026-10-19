	package ExceptionHandling;
	//handling multiple exceptions using nested try catch
	
	
	//try==runtype (unchecked)
	
	public class Nested_try_catch {
		public static void main(String[] args) {
			
			
		int a []= {23,5,0,6,7,8,9,};
		
	System.out.println("Hello everyone..");
	
	
	try {
			try {
				
			
					System.out.println("Arithmatic exceptions  "+a[1]/a[2]);
				}	
	
					catch (ArithmeticException e) {
		
						System.out.println("Inner catch block "+e);
		
						}
			
			
			finally {
				System.out.println("The inner finally exception..");
			}
			
			System.out.println("Secound step: "+a[9]);
			}
	
			catch (Exception e) {
				System.out.println("outer exception.."+e);
			}
	
		finally {
			System.out.println();
		}
	System.out.println("Thank you.. ");
			
	}
	}
