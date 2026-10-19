package LabdaExpression;


 interface Stud 
 {
	 void get();
	 
	 void put();
	   
	 void k1();
	 
	 static void l1()
	 {
		 System.out.println("This is static l1 method..!!");
	 }
	 
	 default  void pp1()
	 {
		 System.out.println("This is a Default Method..!!");
	 }
	 static void ppp1()
	 {
		 System.out.println("This is a Static Method");
	 }
 }
	 
	 class Student implements Stud{
		 
		 public void get()
		 {
			 System.out.println("This is a put method..!!");
		 }
		 
		 public void put()
		 { 
				 System.out.println("This is a put Method..!!");
			 
		 }
		 public void k1()
		 {
			 
				  System.out.println("This is a k1 method..!!");
			 
		 }
		 static void p1()
		 {
			 System.out.println("This is p1 Method..!!");
		 }
		
	 }
 
public class Functional_Interface1 {
	public static void main(String args[])
	{
		Student s = new Student();
		s.get();
		s.put();
		s.k1();
		Student.p1();
		Stud.l1();
		s.pp1();
		Stud.ppp1();
		
		
		
	}

}
