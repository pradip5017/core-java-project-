package Encapsulation;

// setter for writing purpose 
// geter for reading purepose 
//setter => for writing purpose
//getter => for reading purpose
//ReadOnly => we can only read data but cannot write/modify
//If we want to create our own ReadOnly class then just provide getters in that class.
//do not provide any setter

class Login1
{
	public String uname = "Pradip Rathod ";

	public String getUname() {
		return uname;
	}
	
	


}

public class ReadOnly_class {

	public static void main(String args[])
	{
		Login1 l1 = new Login1();
		
//		//l1.uname="harsh";  //error=> bcz, uname is private
	//   l1.setUname("harsh");  //error => setter "setUname()" does not exists
		
		System.out.println(l1.getUname());
				
	}
}



//l1.uname="harsh";  //error=> bcz, uname is private
//   l1.setUname("harsh");  //error => setter "setUname()" does not exists