package Static_keyword;

//2.in non-static nested class we can access both static as well non static var of outer class


//3.to create an object of static Nested class we do not require an object of Outer class
//bcz,Nested is static class and to call static data we do not require any object

class Outer1
{
	int a= 12;
	static int b=13;
	
	 class Nested1  // non static keyword
	{
		void display()
		{
			//error=>      //2.in static nested class we can access only the static var of outer class
			
			System.out.println("a = "+a);  //error=>      //2.in static nested class we can access only the static var of outer class
			System.out.println("b="+b);
		}
	}
}
public class Non_Static_Nested_Class {

	
	public static void main(String args[])
	{
		//too auto generated method stub
		Outer1 p = new Outer1();
		
		Outer1.Nested1  n1 = p.new Nested1();
		 
		n1.display();
		
	}
}
