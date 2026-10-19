package ExceptionHandling;

public class HandlingAnException_using_try_catch_practice {
	public static void main(String args[])
	{
		int a=10, b=0;
		try {
			
			System.out.println(a/b);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("Hello Everyone..!!");
		
	}

}
