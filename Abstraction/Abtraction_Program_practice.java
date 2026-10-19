package Abstraction;

	abstract class Student0 
	{
		abstract void  StudentInfo();
		void name()
		{
			System.out.println("Pradip Ankush Rathod");
		}
		void address()
		{
			System.out.println("sadashiv peth pune Maharashtra..!!");
		}
		
		abstract void mobileno();
	}

	class Student01 extends Student0
	{
		void StudentInfo()
		{
			System.out.println("College Student Informaiton..!!");
		}
		
		void mobileno()
		{
			System.out.println("7218089175");
		}
	}

public class Abtraction_Program_practice {

	public static void main (String args[])
	{
		Student01 s1 = new Student01();
		s1.StudentInfo();
		s1.name();
		s1.address();
		s1.mobileno();
	}
}
