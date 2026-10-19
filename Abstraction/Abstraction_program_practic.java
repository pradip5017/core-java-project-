package Abstraction;

//abtraction / hidden

//We cannot create an object of abstract class bcz,it consists concrete methods which incompletes abstract class
//here,we are creating an object of Pqr bcz,it is non-abstract class


//Abstraction/hidden
//1.Purpose   =>  used to hide data from the user
//2.Definition => means hiding implementation details and showing only functionality to user is called as "abstraction"
//3.e.g    car ,tv remote,messenger(in which we don't know the coding of this application,we just know the functionality of messenger) 
//4.how to implement?
//by creating abstract classes(which consists concrete and abstract methods)
//5.Program
//concrete class  => having only concrete methods
/*class Xyz1
 * 
 */

abstract class Student90
{
	void reg()
	{
		System.out.println("Registration..");
	}
	
	abstract void login();
	abstract void logout();
}


abstract class Stud extends Student90   //abstract class  => having both concrete  and abstract methods
{
		void login()
	{
		System.out.println("User Login..");
	}
	
		void logout() //the method which having both declaration and definition is called as "concrete method".
	{
		System.out.println("User Logout..");
	}
		
		abstract void get();  //implementation  ad an abstract method of Stud class
}


class Stu extends Stud
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

public class Abstraction_program_practic {
	public static void main(String srgs[])
	{
		Stu s1 = new Stu();
		s1.login();
		s1.logout();
		s1.reg();
		
		s1.get();
		s1.display();
	}

}
