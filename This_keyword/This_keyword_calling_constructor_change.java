package This_keyword;


//3rd use of this is => we can call one constructor within the 
//definition/body of another constructor using this keyword 
//and this process is called as "constructor chaining"
class Emp2
{
	int eid;
	String ename; // instance variable
	double sal;
	
	Emp2()
	{
		this("sham", 40000.6);  // this keyword is allocate to 35 line number 
		System.out.println("Defualt  constructor..........");
		
		
		eid =11;
		ename = "ram";
		sal = 20000.4;
		
		{
			System.out.println("Employee id is ="+eid);
			System.out.println("Employee name is ="+ename);
			System.out.println("Employee salary is ="+sal);
		}
	}
	
	Emp2(String ename, double sal)
	
	//3rd use of this is => we can call one constructor within the 
    //definition/body of another constructor using this keyword 
      //and this process is called as "constructor chaining"
	{
		
		this("jiva", 6000.7, 77);  //this is allocate to 50 line number
		
		this.ename = ename;
		this.sal = sal;
		
		System.out.println("Employee name is ="+ename);
		System.out.println("Employee salary is ="+sal);
		
		
		
		
	}
	
	
	Emp2(String ename, double sal, int eid)
	{
		
		ename = ename;
		sal = sal;
		eid =eid;
		
		
		System.out.println("Employee name is ="+ename);
		System.out.println("Employee salary is ="+sal);
		System.out.println("Employee id is ="+eid);
		
		
	}
}







	public class This_keyword_calling_constructor_change {
	public static void main(String args[])
	{
		Emp2 e1 = new Emp2();
		
		
//		Emp e2 = new Emp(12, "jiva", 40000);
//		e2.putDispplay();
	}


}






//3rd use of this is => we can call one constructor within the 
//definition/body of another constructor using this keyword 
  //and this process is called as "constructor chaining"