		package This_keyword;
		
		class Laptop {
			
			int lid;   //instance variable 
			String company;
			double price;
			
		
		
		void takeValues(int lid, String company, double price) //formar argument list 
		{
		
			this.lid = lid;  // local variables
			this.company = company; 
			this.price = price;
		}
		
		void printValue()
		{
			this.msg();   //this keyword is use to call the inside of a class and method and constructor 
			System.out.println("loptop id ="+lid);
			System.out.println("loptop company name="+company);   //assign 
			System.out.println("laptom price ="+price);
			
			
		}
		
		void msg()
		{
			this.put();
			System.out.println(" Thank you");
		}
		
		void put()  // method 
		{
			this.get();
			System.out.println("This is a chainning ");
		}
		
		void get()
		{
			System.out.println("Wellcome to java program");
		}
		
		
		}
		
public class This_keyword_calling_instance_Method_chainning {
			
			public static void main(String args[])
			{
				
				Laptop l1 = new Laptop();  //object through call 
				l1.takeValues(22, "Ram" , 6700);
				l1.printValue();
				l1.msg();
			}
		
		}
