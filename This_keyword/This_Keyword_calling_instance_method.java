package This_keyword;


//method chaining =>
class Laptop6
{
	int lid;   //instance varaible
	String company;
	double price;
	
	void takeValues(int lid,String company, double price     )
	{
		this.lid=lid; 
		this.company=company;
		this.price =price;
		
	}
	
	void printValues()
	{
		this.msg();  //2nd use of this is => we can call one method within the 
		         //definition/body of another method using this keyword 
		//and this process is called as "method chaining"
		System.out.println("laptop id  = "+lid); //4
		System.out.println("laptop comapany name = "+company);
		System.out.println("laptop price  = "+price);
	}
	
	void msg()
	{
		this.show();
		System.out.println("\nin msg() =>thank u.."); //3
	}
	
	void show()
	{
		this.put();   
		System.out.println("\nin show() =>Program for method chaining using this keyword ");//2
	}
	void put()
	{
		System.out.println("\nin put() =>Welcome to java programming...");//1
	}
	
}


public class This_Keyword_calling_instance_method {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Laptop6 l1 =new Laptop6();
				l1.takeValues(101, "hp", 78877.2);  //actual paramter
				l1.printValues();
		
		
//				l1.put();
//				l1.show();
//				l1.msg();
	
	}
}



























