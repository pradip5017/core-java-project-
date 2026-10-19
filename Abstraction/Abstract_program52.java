package Abstraction;

 abstract  class Student{
	  
	 abstract void put();
	 abstract void get();
	 
	 void StudentName()
	 {
		 System.out.println("Pradip Rathod..!!");
	 }
	 void StudentAddress()
	 {
		 System.out.println("Pune Maharashtra..!!");
	 }
	
 	}
 class Student1 extends Student 
	 {
		 void get()
		 {
			 System.out.println("getting of data..!!");
		 }
		 void put()
		 {
			 System.out.println("putting of data..!!");
		 }
	 }
public class Abstract_program52 {
	public static void main(String args[])
	{
		Student1 s1 = new Student1();
		s1.StudentName();
		s1.StudentAddress();
		s1.get();
		s1.put();
		
	}

}
