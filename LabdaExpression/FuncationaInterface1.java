package LabdaExpression;

	@FunctionalInterface
	 interface Heelo
	 
	 {
		 public void  HelloSay();  // single abstract method
		 
		 default void put() {  // allow default method in functional inteface prgram
			 System.out.println("This is defual method.");
		}
		 public static void by()
		 {
			System.out.println(" Hello this is static method "); 
		 } 
		 
		 
	 }
	 
	  abstract  class Hello2 implements Heelo{

		  public void HelloSay()
		{
			System.out.println("This is abstract Method.");
		}
	  }
	class Abs extends Hello2{
		
		void mains()
		{
			System.out.println("This is normal class..");
		}
	}
public interface FuncationaInterface1 {
	public static void main(String args[])
	{
		Heelo.by();
		Abs s1 = new Abs();
		s1.HelloSay();
		s1.put();
		s1.mains();
	}		

}
	  
