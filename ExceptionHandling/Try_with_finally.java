package ExceptionHandling;
//Q.Can we write only try in the program?
//no, it must be followed by either catch or finally or both

//Q. Can we write try without catch?
//yes..we can write try without catch but that try should be followed by finally



public class Try_with_finally {
	
	public static void main(String[] args) {
		
		int a=12, b=0;
		
		System.out.println("hi program");
		
		try {
			System.out.println("Try to start ");
		System.out.println(a/b); 	//from this line of code the program execution control will get transfer on catch block and will never get back on try block to execute remaining hence we should only the exceptional code in try block
		}
		
		
		finally
		  {
			    System.out.println("Finally block will alwayes get executes whether an exception occurred or not");
			    System.out.println("So we can put an important code of our application inside finally block");
			    
		  }
		  
		  System.out.println("sub ="+(a-b));
		  System.out.println("thank u");
	}

}
