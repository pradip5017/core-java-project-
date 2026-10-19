package This_keyword;

class Book
{
	int bid;
	String bname;
	double price;   //instance variable
	
	
	//defualt 
	// paramiterize constructor 
	
	Book()
	{
		bid =1;
		bname = "Java";
		price = 50.6;
	}
	
	
	/*Book(int a , String b, double c)
	{
		bid=a;
		bname =b;
		price = c;
		
	}*/
	
	Book(int bid , String bname, double price)
	{
		this.bid=bid;
		this.bname =bname;
		this.price = price;   //gloable variable 
		
	}
	
	void putData() {
		
		System.out.println("bookd id ="+bid);
		System.out.println("bookd name ="+bname);
		System.out.println("bookd pricee ="+price);
		
		
	}
	
	
	
	
}



public class This_keyword_for_Calling_Instance_variable {

	public static void main(String args[])
	{
		Book u1 = new Book(34, "java", 89.6);
		u1.putData();
		
		Book u2=new Book();
		
		u2.putData();
		
		
		
	}
}
