package This_keyword;

//this => this keyword is used to call instance variable and instance method
//this keyword is represent current instance/object of class

class Book11
{
	int bid;
	String bname; //instance variable
	double price;
	
 Book11()
 {
	    bid=101;
		bname="cpp";
		price=600.8;
		
		
	}
         //  1        java         200.8
	Book11( int bid,String bname,double price) //local argumetn list 
	{
	    this.bid=bid;   //here,  bid is local variable and this.bid is instance variable

		this.bname=bname;    //1st use of this => whenever you are using same 
		                   //name for instance and local variable..

		//so to identify the difference between local and insatnce var we need to use this keyword
		this.price=price;  
		
		
		//declaire variable to instance variable to local variable 
	}
	
	void putData() //method
	{
	System.out.println("Book Id="+this.bid);
	System.out.println("Book Name="+this.bname);  //assign value to instance variable
	System.out.println("Book Price="+this.price);
	}
	
}


public class This_keyword_for_calling_instance_variable_to_instanceMethod {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book11 bk=new Book11(1, "java", 200.8);  //paramterized
		bk.putData();
		
		System.out.println("**************************");
	 
		Book11 bk2=new Book11();
		bk2.putData();
		
		
//		thisbid
//		bk.price
	}

}











































