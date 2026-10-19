package LabdaExpression;

  interface Parent
 {
	 default void SayHello()
	 {
		 System.out.println("Hellooo");
	 }
	 
	 void put();
	 
 }
  
  class Child implements Parent{
	  
	public  void put()
	  {
		Parent.super.SayHello();
		  System.out.println("Putting data..!!");
	  }
  }
public class Default_Method_Interface {
	public static void main(String args[])
	{
		Child c1 = new Child();
		c1.put();
//		c1.SayHello();
	}

}
