package Static_keyword;

class Student10
{
	int id;
	String name;
	String college;
	static String course = "BCS";
	
	
	Student10(int id, String name, String college) //formal location constructor 
	{
		this.id=id;
		this.name=name;
		this.college=college;
//		this.course = course;
	}
	
	void putValue()
	{
		System.out.println("Student id is ="+id);
		System.out.println("Student name is ="+name);
		System.out.println("Student college name is ="+college);
		System.out.println("Student course name is ="+course);
		
	}
	
	Student10()
	{
		
		
		id=44;
		name="Jiva";
		college = "Adity college beed";
		
		
		System.out.println("Student id is ="+id);
		System.out.println("Student name is ="+name);
		System.out.println("Student college name is ="+college);
		System.out.println("Student course name is ="+course);
	}
	
	Student10(int id, String name)
	
	{
		this.id=id;
		this.name=name;
		this.college=college;
		
	}
	void getValue()
	{
		System.out.println("Student id is ="+id);
		System.out.println("Student name is ="+name);
		System.out.println("Student college name is ="+college);
		System.out.println("Student course name is ="+course);
	}
	
	
}

public class Static_keyword_Demo {
	
	public static void main(String args[])
	{
		Student10 p = new Student10(22, "pradip", "sb");
		p.putValue();
		
		
		
		System.out.println("\nSecound Student name........\n");
		
		Student10 u = new Student10();
		
		System.out.println("\nThrird student is =.......\n");
		Student10 r = new Student10(34, "Rahul", "sbes" );
		r.getValue();
		
		
		
	
	}

}
