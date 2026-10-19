	package Class_and_object;
	
	
	 class Abc {
		
	
		void Add(int a, float b, double c)
		{
			
			double d = a+b+c;
			System.out.println("addition = "+d);
			System.out.println("bye");
			
				}
		
		void mul(int a, float b, double c)
		{
			double e = a*b*c;
			System.out.println("Area of circle = " +e);
			
		}
		
		// area of circle void method assign for home works
		
		
	
		
	}
	
	public class Method_in_java {
	
		public static void main(String args[]) 
		{
			Abc a1 = new Abc();
			
			a1.Add(6, 2.6f, 34.34);
			
			a1.mul(4, 4.5f, 567.6);
			System.out.println("Thank you");
			
			
		}
		
	
	}
