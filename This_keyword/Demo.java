package This_keyword;

class Demo1
{
	int id;
	String name;
	double age;
	
	
	Demo1()
	{
		id= 67;
		name = "pradip";
		age = 67.5;
		
	}
	
	Demo1(int id, String name , double age )
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void putData()
	{
		System.out.println("The id is ="+id);
		System.out.println("The name is ="+name);
		System.out.println("The age is ="+age);
	}
	
	
}





public class Demo {
	
	public static void main(String args[])
	{
		Demo1 d = new Demo1();
		d.putData();
		
		System.out.println("...........................");
		Demo1 p = new Demo1(23, "Jivan", 67.5);
		p.putData();
	}

}
