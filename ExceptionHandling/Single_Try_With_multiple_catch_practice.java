package ExceptionHandling;

public class Single_Try_With_multiple_catch_practice {
	public static void main(String args[])
	{
		int a []= {12,2,3,4,5,6,7,8,5,4,5,6};
		
		
		System.out.println(a[0]);
		
		try {
			
			System.out.println(a[0]/a[16]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("Hello Everyone..!!");
	}

}
