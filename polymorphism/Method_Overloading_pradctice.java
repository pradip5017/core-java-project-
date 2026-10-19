package polymorphism;

	class Person{
		
		void get(int a , int b)
		{
			System.out.println("Addition is ="+(a+b));
		}
		
		void get(int b, double c)
		{
			
			System.out.println("Substraction is ="+(b-c));
		}
		
		void get(float a, int b)
		{
			System.out.println("Multiplication is ="+(a*b));
		}
	}
public class Method_Overloading_pradctice {
	public static void main(String args[])
	
	{
	
		Person p1 = new Person();
		p1.get(2, 3);
		p1.get(5, 9.4);
		p1.get(5.4f, 10);
		
	}

}
