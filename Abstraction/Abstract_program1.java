	package Abstraction;
	
	abstract class Student91
	{
		void reg()
		{
			System.out.println("Registration..");
		}
		
		abstract void login();
		abstract void logout();
	}
	
	
	abstract class Stud1 extends Student90   //abstract class  => having both concrete  and abstract methods
	{
			void login()
		{
			System.out.println("User Login..");
		}
		
			void logout() //the method which having both declaration and definition is called as "concrete method".
		{
			System.out.println("User Logout..");
		}
			
			abstract void get(); //implementation  and an abstract method of Stud class
	}
	
	
	class Stu1 extends Stud
	{
		void get()
		{
			System.out.println("The extend the properties...");
		}
		
		void display()   // increte 
		{
			System.out.println("Hello word......");
		}
	}
	
	public class Abstract_program1 {
		public static void main(String srgs[])
		{
			Stu1 s1 = new Stu1();
			s1.login();
			s1.logout();
			s1.reg();
			
			s1.get();
			s1.display();
		}
	
	
	}
