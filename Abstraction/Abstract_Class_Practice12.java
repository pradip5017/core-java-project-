package Abstraction;

//creating a abstract class in using abstract class in java 

	abstract class Person12
	{
		String name="pradip";
		 String a ="7218089175";
		 String email="pradiprathod5017@gmail.com";
		 String add = "pune";
		
		abstract void personinfo();
		
		abstract void personAddresss();
		
		void persongMobile()
		{
			System.out.println("Person Mobile number id is = "+a);
		}
	}
	
	abstract class Employee12 extends Person12{
		
		abstract void EmployeeAdd();
		
		void personEmail()
		{
			System.out.println("Employee Email id="+email);
		}
	}
	
		class Stud12 extends Employee12{
		
		void personinfo()
		{
			System.out.println("Name is ="+name);
		}
		
		void personAddresss()
		{
			System.out.println("Person Address is ="+add);
		}
		
		void EmployeeAdd()
		{
			System.out.println("employee address ="+add);
		}
		
	}
	
	
	
	
public class Abstract_Class_Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud12 s1 = new Stud12();
		s1.personinfo();
		s1.persongMobile();
		s1.personEmail();
		s1.personAddresss();
		s1.EmployeeAdd();
	}

}
