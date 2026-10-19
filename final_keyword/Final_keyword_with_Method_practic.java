package final_keyword;

 class Parent
{
	 void put() // final method does not allow to parent class
	{
		System.out.println("Hello evertyone");
	}
	
	 void get()
	{
		System.out.println("The get data..");
	}
}

  class Child extends Parent
{
	 void display()
	{
		System.out.println("The print of Display method");
	}
	final void put()   // final method is allow to child class 
	 {
		 System.out.println("Hello everyone is change");
	 }
}

public class Final_keyword_with_Method_practic {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		
		c1.put(); // final keyword use so does not change this line
		c1.get();
		c1.display();
	}
}
