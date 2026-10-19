package ExceptionHandling;
//Exception/error(mistakes)
		//1.compie-time/syntax error => e.g ; missing,spelling mistakes
		//2.run-time/logical error => Exceptions


//EXceptions are nothing but runtime errors

//EXceptions are recoverable or handled using exception handling keywords/blocks
//Errors are irrecoverable means we cannot recover error by using any technique
/*
Q. why we need to handle an exceptions in the program?

=> because, if exception will get occurred in our program, 
then because of these exceptions our rest of the code
will not get execute even if it is correct and will not get proper output.
So to maintain the proper flow of our program execution, 
we need to handle the exception

*/
//there are 2 types of exceptions
		//1.checked/compile time
	  //2.unchecked/runtime => unchecked exceptions are remain unchecked by the compiler at a compile time of program


public class GeneratingRuntimeException {

	public static void main(String[] args) {
		
//		exceptin(error)
//		error is simply mistake
//		1 compile type error mins syntax error 
//		2 run type error (logical error)
//		exception error is run type error
		
		
		//Exception/error(mistakes)
				//1.compile-time/syntax error => e.g ; missing,spelling mistakes
				//2.run-time/logical error => Exceptions

		
//		ArithmaticException: // by zero
//		int a=12, b=0;
//		System.out.println("hi");
//		System.out.println(a/b);
//		System.out.println("by");
//		
//		
//		2
//		int a[]= {23,54,765,878,98};
//		System.out.println(a[3]); //error for run time 
//		System.out.println(a[20]);
//		System.out.println(a[4]);
		
//		3 
		
//		String s2 = null;
//		System.out.println(s2.length());
		
		
	//4.StringIndexOutOfBoundsException: String index out of range: 13
	       //0 123456
//	String s="welcome";
//	System.out.println(s);
//	
//	System.out.println(s.charAt(13));
//	
		/*
		String s3 = " Rathod ";
	String se = "pradip";
//	System.out.println("The String legth is ="+se.concat(s3));
//	System.out.println(s3+se);
//	System.out.println(s3.toUpperCase());
//	System.out.println(se.charAt(5));
	System.out.println(s3.replaceFirst(s3, se));
	System.out.println(se.compareTo(s3));
	*/
	
//	5.NumberFormatException: For input string: "hello"
	//String s="hello";
//  String to int conversion    //hello into int
//
	//System.out.println(Integer.parseInt(s));
		
			//4.StringIndexOutOfBoundsException: String index out of range: 13
	   /*    //0 123456
	String s="welcome";
	System.out.println(s);
	
	System.out.println(s.charAt(13));
	*/
	
	
	//5.NumberFormatException: For input string: "hello"
//	String s="hello";
	//String to int conversion    //hello into int

//	System.out.println(Integer.parseInt(s));
		
		
	}

}
