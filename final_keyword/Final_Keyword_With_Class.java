	package final_keyword;
	//Q.How we can create our own immutable(non-changeable) class?
	//=>by declaring that class as a final
	
	//the class which is declared as a final..cannot inherit into the child class
	  class Animal2
	{
		//final void run()                   //or  the method which is declared as a final cannot be override
		 String color = "while";
		 void run()
		{
			System.out.println("in parent run() : ");
			System.out.println(color);
			
		}
	   }
	   final class Dog11 extends Animal2 // final keyword allocate in class line 
	   {
		void eat()    ///overridden method of parent class
		{
			System.out.println("in child eat() : ");
		}
	  }
		public class Final_Keyword_With_Class {
		public static void main(String args[])
		{
			Dog11 d1 = new Dog11();
			d1.run();
			d1.eat();
			
			
		
	}
	}
