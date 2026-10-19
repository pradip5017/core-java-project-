package Static_keyword;

	class Emp12
	{  
	int id;
	String name;
	static String company = "tcs";

//2.advantage=> if we declare data(variable,method) as a static then to call that static data,we dont't need to create an object of a class

//bcz,we can call that data using class name

	Emp12(int id, String name)
  {
	this.id=id;
	this.name=name;
	
	//1.static keyword is used to DECLARE variable,method,block,class as a static 
	//non-static method called by=> object name
	//static method called by => class name

}


	void show()
{
	System.out.println("Employee id is ="+id);
	System.out.println("Employee name is ="+name);
	System.out.println("Employee company name is ="+company);
	
}
	
	static void chenge() //static variable(common) => static variable refers to common property of an object
	//means we don't have to initialized static variable with each object
	{
		company="Infosys";
		//static method can allow only static members
		//we can change the value of static variable
	}
}


public class static_keyword_variable_method {
	public static void main(String args[]) 
	{
//		object...we can initialized it only once and that one value is shared by all the objects of a class 
		//and hence static variable is used to save memory space
		//non-static instance variable
		//static instance variable
		//const/final(fixed)=> non-changeable,
		//static(common)=> changeable
	
		Emp12.chenge();  //static method called by class name
	System.out.println("Emoloyee names");
	Emp12 e = new Emp12(11, "ram");
	e.show();
	
	
	Emp12 e1 = new Emp12(12, "sham");
	e1.show();
	
	
	Emp12 e2 = new Emp12(13, "Jiva");
	e2.show();
	
	
}

}

