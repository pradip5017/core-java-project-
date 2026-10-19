package This_keyword;

//Q. Can we overload constructor?
//yes..we can overload PARAMETERIZED constructor but we can't overload default constructor

//constructor chaining


//WAp to perform method chaining by creating 4 methods in a class.... Each method is performing arithmetic
//operation like one method is performing addition, second is performing subtraction and so on

class Emp22
{
	int eid;
	String ename;
	double sal;
	
	Emp22()  //default
	{
		this(45888.8,"ketan",88);  //jumps on line no 31
		System.out.println("\n------default constructor---------");
      eid=101;
      ename="jay";
      sal=78889.7;
      
      System.out.println("emp id = "+eid);
		System.out.println("emp name  ="+ename);
		System.out.println("emp sal  = "+sal);
	}
	          //45888.8,   "ketan", 88
	Emp22(double sal,String ename,int eid) // paramatric constructor 
	{
		this(90,"priya");     //jumps on line no 51
		                 //3rd use of this is => we can call one constructor within the 
                        //definition/body of another constructor using this keyword 
                          //and this process is called as "constructor chaining"
		 System.out.println("\n------parameterized constructor---------");
		 this.eid=eid;
		 this.ename  = ename;
		 this.sal =sal;
		 
		 System.out.println("emp id = "+eid);
			System.out.println("emp name  ="+ename);
			System.out.println("emp sal  = "+sal);
	}
	      //90           priya
	
	Emp22(int eid,String ename)
	{
		System.out.println("\n------parameterized constructor2---------");
		 this.eid=eid;
		 this.ename  = ename;
		 
		 System.out.println("emp id = "+eid);
			System.out.println("emp name  ="+ename);
			
		 
	}
	/*Emp2(String ename)
	{
		System.out.println("------parameterized constructor---------");
		
		 this.ename  = ename;
		 
	}*/
	
}


public class This_keyword_for_calling_constructor {



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		 
		
		 Emp22 e2=new Emp22(); //default
		// e2.display();
				
		 //constructor chaining
				
	}

}





















