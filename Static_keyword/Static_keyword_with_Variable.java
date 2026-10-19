package Static_keyword;


class Student5
{
	int id;
	String name;  // instance variable 
	static String college;
	
	
	
	Student5()
	{
		
//		this.getValue();
		
		this.id=22;
		this.name= "sham";
		this.college="Adity college"; 
	}
	
	void putValues()
	{
		
		System.out.println("The Student id is ="+id);
		System.out.println("The Student name is ="+name);
		System.out.println("The Student college is ="+college);
		
	}
	
	Student5(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public void dis()
	{
		System.out.println("Student id is ="+id);
		System.out.println("Student id is ="+name);
		System.out.println("Student id is ="+college);
	}
	
	
	
//	Student5()
//	{
//		id=44;
//		name = "ram";
//		college = "Sbcolleg";
//	}
//	
//	void getValue()
//	{
//		System.out.println("The Student id is ="+id);
//		System.out.println("The Student name is ="+name);
//		System.out.println("The Student college is ="+college);
//	}
	
	
	static void chenge()
	{
		college="Sbes College Chh, Sambhaji nagar";
	}
	
	
}




public class Static_keyword_with_Variable {
	public static void main(String args[])
	{
		Student5 p = new Student5();
		Student5.chenge();// change college name of static keyword through
		p.putValues();
//		Student5  u = new Student5(55, "Jiva", "djkhfd");
		
//		u.getValue();
		Student5.chenge(); // change college name by using static keyword..
		Student5 r = new Student5(22, "pradip");
		r.dis();
		
				
	}
}
