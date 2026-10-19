package Super_Keyword;
class Person3
{

	int age;
	String name;
	
 Person3(int age, String name)
{
		this.age = age;
		this.name= name;
		// TODO Auto-generated constructor stub
	}
	
	
}

class Student3 extends Person3
{
	Double marks;

 Student3(int age, String name, Double marks) {
		super(age, name);
		this.marks = marks;
		
		this.age=age;
		this.name=name;
		this.marks=marks;
	}
	
	void show()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(marks);
	}
	
	
}

public class Super_keyword_for_calling_person {
	public static void main(String args)
	{
		Student3 s1 = new Student3(11, "Ram", 56.5);
		s1.show();
	}

}
