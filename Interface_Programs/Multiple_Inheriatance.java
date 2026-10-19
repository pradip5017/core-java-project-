package Interface_Programs;

/*
//concrete class => consists of only concrete methods
class Abc
{
	void show()
	{
		
	}
}
//abstract class =>  consists of both concrete and abstract methods
class Pqr   
{
	 void put()
	 {
		 
	 }
	 
	 abstract void disp();
}
*/
//class to class relationship=> extends
//interface to class relationship=> implements

//1.interface =>  consists of only ABSTRACT(having declaration only) methods
//2.interface is used to achieve multiple inheritance and data abstraction in java 
//3.interface should always be implement in a class
//4 interface is a blue print of a class and define behavior of a class

interface Lmn
{
	public abstract void reg();           //3.the methods in interfaces are by default public abstract
		void login();		
		void logout();    //hiding of a data      abtract is a hidding of a data 
		
}

abstract class Xyz implements Lmn     //Lmn=> parent , Xyz=> child
{
	public void reg()
	{
		System.out.println("in ref");
	}
	
//	public void login()
//	{
//		System.out.println("User Login");
//	}
	
	public void logout()
	{
		System.out.println("user Logout");
	}
}


class pqr extends Xyz    
{
	 public void login()
	{
		System.out.println("User login");
	}
	
	public boolean sesion()
	{
		return true;
	}
}

public class Multiple_Inheriatance {
	public static void main(String args[])
	{
//		Xyz l1 = new Xyz();
//		l1.reg();
//		l1.login();
//		l1.logout();
		
		//we cannot create an object of abstract class and interface but we  can create reference variable of it
		pqr p1 = new pqr();
		p1.login();
		p1.logout();
		p1.reg();
		System.out.println("the session is ="+p1.sesion());
		
		
		
		
		
		Lmn l1 = new pqr(); //here, l1 is the reference variable of Lmn and an object of Pqr
		l1.login();
		l1.logout();
		l1.reg();
//		
		
		
				
		
//		
	}

}




