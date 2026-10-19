package ExceptionHandling;

/*Q. Can we write a multiple  catch blocks with single try?
=> yes..we can write..but among that all catch blocks only one catch block
 will get execute respective to the exception that gets occurred in the try  

bcz, once control transfer onto the catch from the try...it will never get 
back onto the try...and it will not get execute rest of the code of try
*/

public class Single_Try_With_multiple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,56,76,87,98};
		
		System.out.println("hi everyone...");
		
		try {
			
		System.out.println(a[0]); //array index call by first step of exceptions
		
		System.out.println(a[3]/a[6]); // Arithmatic  exceptions
		
		}
		catch (ArrayIndexOutOfBoundsException e) {  //one catch can handle only one exception at a time

			System.out.println("second exception "+e);
		}
		
		catch (Exception e) {  //does not call secound exception 
			System.out.println("First exception "+e);
		}
		System.out.println("Thank you ..");

	}

}
