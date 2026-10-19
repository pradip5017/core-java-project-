		package Super_Keyword;
		
		class Person1
		{
		String address ="Pune";
		
		void eat()
		{
			System.out.println("Eating a food....");
		}
		
		}
		 class Student53 extends Person1
		 {
			 String address ="Mumbai";
			 
			 void display()
			 {
				 super.eat();
				 System.out.println("accessing the proprty of current class using this keyword="+this.address);
				 System.out.println(address);
				 System.out.println("Accessing the property of PARENT/SUPER class using keyword="+super.address);
				 
			 }
		 }
		public class Super_keyword_For_Calling_valiable_and_Method {
			public static void main(String args[])
			{
				Student53 s2 = new Student53();
				s2.display();
			}
		
		}
