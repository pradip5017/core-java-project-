package ExceptionHandling;
//Exception is nothing but a unexcepted unwanted condition that occure during the execution of program and terminal the normal program

//5 exception handling keywords/blocks
//1.try   2.catch 3.finally  4.throw 5.throws

//try => try consists of code that might generate an exception
//try must be followed by catch or finally or both
 
//catch => catch block catches or handles the exception which is thrown by try


public class HandlingAnException_using_try_catch {
public static void main(String[] args) {
	
	int a=12, b=0;
	
	System.out.println("hi program");
	
	try {
		System.out.println("Try to start ");
	System.out.println(a/b); 	//from this line of code the program execution control will get transfer on catch block and will never get back on try block to execute remaining hence we should only the exceptional code in try block
	}
	catch(ArithmeticException e) {  //this catch can handle only ArithmeticException 
		
		System.out.println(e); 
		
				
	}
	/* catch(Exception  e )  //this catch can handle ALL types of exception 
	{
		
	} 
	*/
	
	System.out.println("byy.....");
	
}

}
