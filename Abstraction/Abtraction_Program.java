package Abstraction;
//abtraction / hidden

//We cannot create an object of abstract class bcz,it consists concrete methods which incomplited abstract class
//here,we are creating an object of Pqr bcz,it is non-abstract class


//Abstraction/hidden
//1.Purpose   =>  used to hide data from the user
//2.Definition => means hiding implementation details and showing only functionality to user is called as "abstraction"
//3.e.g    car ,tv remote,messenger(in which we don't know the coding of this application,we just know the functionality of messenger) 
//4.how to implement?x
  //by creating abstract classes(which consists concrete and abstract methods)
//5.Program
//concrete class  => having only concrete methods
/*class Xyz1
{
    //concrete method
		void show()    //the method which having both declaration and definition is called as "concrete method".
		{
			
		}
		
		void msg()    //the method which having both declaration and definition is called as "concrete method".
		{
			
		}
}*/

 abstract  class Login1   //abstract class  => having both concrete  as well as  abstract methods   only declaration 
 
{  //concreate method
	void reg() //the method which having both declaration and definition is called as "concrete method".
	
	{
		System.out.println("In Regestration mathod");  //concreate method
	}
	
	abstract void logout();  //the method which having only declaration NOT definition in one class is called as "concrete method".
	abstract void login();   //implementation  add an abstract method of Login class
}
 
 class Pqr extends Login1
 
 {
	 void login() 
	 {
		 System.out.println("The loging method");
	 }
	 
	 void logout()
	 {
		 System.out.println("The logout method");
	 
	 }
	 }

    public class Abtraction_Program {
	public static void main(String args[])
	{
	
	Pqr p1 = new Pqr();
	p1.reg();
	p1.login();
	p1.logout();
	
	}

}



//addhura.........