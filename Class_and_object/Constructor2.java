	package Class_and_object;
	
	
	class Userr
	{
		
	void addNumber(int a, float b, double c)
	{
		double d = a+b+c;
		System.out.println("Additioin is "+d);
		
		System.out.println("Addition is confirm ....");
	}
	void areCircle(double pi , int r )
	{
		System.out.println("Area of circle is " +pi*r*r);
		
		System.out.println("The pi and circle value assign........");
	}
	
	
	
	}
	public class Constructor2 {
		public static void main(String args[])
		{
			
		
		
		Userr u = new Userr();
		u.addNumber(56, 6.7f, 76.4);
		u.areCircle(5, 7);
		
		
		System.out.println("Hi this is a main Classs");
	
	}
	}
