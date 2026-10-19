//we cannot declare outer class as static..bcz,we are declaring Outer class as a static then it will be considered as as static area and then it do not allow not static members.
//***Difference between  Static nested class and non Static nested class
//1. to declare Static nested class we need to use static keyword
//1. to declare non-Static nested class we need NOT to use static keyword

//2. in static nested class we can access only the static var of outer class
//2.in non-static nested class we can access both static as well non static var of outer class
 
 //3.to create an object of static Nested class we do not require an object of Outer class
//bcz,Nested is static class and to call static data we do not require any object
//3.to create an object of non static Nested class we required an object of Outer class

package Static_keyword;


class Outer10  //outer  class
{
	int id = 23;
	String name = "pradip";
	static	String adress = "pune";
	
	
		class Nested10  //inner class
	{
		void  Display()
		{
			System.out.println("The address is ="+name);
			System.out.println("The address is ="+adress);
			System.out.println("The address is ="+id);
			
		}
		
		
	}
		
		 class Nested11
		{
			 {
			id = 43;   //value initialized 
			name="Jivan";
			adress= "ch, Sambhaji nagar";
		}
			 
			void getDisplay()
			{
				System.out.println("\nThe Studen informatioin  is =\n");
				System.out.println("The address is ="+name);
				System.out.println("The address is ="+adress);
				System.out.println("The address is ="+id);
			}
		}
}



public class Non_Static_Nested_classs_Practic {
	
	public static void main(String args[])
	{
		Outer10 u = new Outer10();
		Outer10.Nested10 p = u.new Nested10();
		p.Display();
		
		
		Outer10.Nested11 i = u.new Nested11();
		i.getDisplay(); // declation of a method
		
	}

}
