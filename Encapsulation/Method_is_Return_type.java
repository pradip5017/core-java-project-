package Encapsulation;

//setter for writing purpose 
//geter for reading purepose 
//setter => for writing purpose
//getter => for reading purpose
//ReadOnly => we can only read data but cannot write/modify
//If we want to create our own ReadOnly class then just provide getters in that class.
//do not provide any setter

class Emp21
{
	private int uid;
	private String uname;
	private String college;  // instance variable 
	
	void setUid(int uid) // method 
	{
		this.uid=uid;
		
	}
	void setUname(String uname) // setter for writing purpose 
	{
		this.uname=uname;
	}
	
	void setCollege(String college)
	{
		this.college=college;
	}
	
	int  getUid()   // geter for reading purepose 
	{
		return uid;
		
	}
	String getUname()  //If we want to create our own ReadOnly class then just provide getters in that class.
	{
		return uname;
		
	}
	
	String getCollege()
	{
		return college;
		
	}
	
}
public class Method_is_Return_type {
	public static void main(String args[])
	{
		Emp21 e1 = new Emp21();
		
		e1.setUid(11);
		e1.setUname("Pradip");
		e1.setCollege("Sb college"); // decalation of a values 
		
		
		System.out.println("Student id is = "+e1.getUid()); // calling a object through geter method
		System.out.println("Student id is = "+e1.getUname());
		System.out.println("Student id is = "+e1.getCollege());
		
		
		Emp21 e2 = new Emp21();
		e2.setUname("Rahul");
		System.out.println("The student name is= "+e2.getUname());
		
		
		
	}
	
	

}
