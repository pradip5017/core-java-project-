package Static_keyword;



	class Emp11
{
	int id;
	String name;
	static String company = "tcs";
	
	
	
		Emp11(int id, String name) //constructor 
	{
		this.id=id;
		this.name=name;
		
	
	}

	
		void show()  //method
	{
		System.out.println("Employee id is ="+id);
		System.out.println("Employee name is ="+name);
		System.out.println("Employee company name is ="+company);
		
	}
}

public class Static_keyword_with_variable_and_method {
	
		public static void main(String args[])
		
	
	{
		
		System.out.println("Emoloyee names");
		Emp11 e = new Emp11(11, "ram");
		e.show();
		
		
		Emp11 e1 = new Emp11(12, "sham");
		e1.show();
		
		
		Emp11 e2 = new Emp11(13, "Jiva");
		e2.show();
		
		
	}

}
