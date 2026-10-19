package Static_keyword;

//error=>      //2.in static nested class we can access only the static var of outer class

//3.to create an object of static Nested class we do not require an object of Outer class
//bcz,Nested is static class and to call static data we do not require any object
class Outer  // class 
{
	int a= 12;
	static int b=13;
	
	static class Nested  // Static keyword
	{
		void display()
		{
//			System.out.println("a = "+a);  //error=>      //2.in static nested class we can access only the static var of outer class
			System.out.println("b="+b);
		}
	}
	
		void put()
		{
			System.out.println( "A is "+a);
		}
}

public class Static_Nested_Class {

	public static void main(String args[])
	{
		//too auto generated method stub
		Outer.Nested p = new Outer.Nested();  //3.to create an object of static Nested class we do not require an object of Outer class
        //bcz,Nested is static class and to call static data we do not require any object

		p.display();
		
		Outer o2 = new Outer();
				o2.put();
		
	}
}


//types of nested classes
//1.Static nested class
//2.non-Static nested class(inner class)

//we cannot declare outer class as static..bcz,we are declaring Outer class as a static then it will be considered as as static area and then it do not allow not static members.
//***Difference between  Static nested class and non Static nested class
//1. to declare Static nested class we need to use static keyword
//1. to declare non-Static nested class we need NOT to use static keyword

//2. in static nested class we can access only the static var of outer class
//2.in non-static nested class we can access both static as well non static var of outer class

//3.to create an object of static Nested class we do not require an object of Outer class
//bcz,Nested is static class and to call static data we do not require any object
//3.to create an object of non static Nested class we required an object of Outer class