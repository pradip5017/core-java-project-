package Class_and_object;


class Studentt
{   // instance variable 
	int id;
	String name;
	float age;
	
	
	//void get data
		//void putdata
	
	
	
	void getData(int a, String b, float c) // paramiter add of variable
	{
		id = a;
		name = b;  //1.method declaration(for now, calling=> inside userdefined class)
	    age  = c;
	}
	
	void putData()
	{
		System.out.println("Student is =" +id);
		System.out.println("Student name =" +name);
		System.out.println("Student age is  =" +age);
		
		//2.method definition/create(for now, calling=> inside userdeifned class)
		
	}
	
}

public class Constructor3 {
	public static void main(String args[])
	{
		Studentt p = new Studentt(); // object throuw call by instance variable 
		p.getData(23, "ram", 45.4f);
		p.putData();
		
		//3.method calling/use(for now, calling=> inside main)
		
		System.out.println("....................");
		p.getData(45, "pradip", 23.2f);
		p.putData();
	}

}

//method => it is a block of/set of coding statements. Which we create once and
//call it over multiple times

//1.method declaration(for now, calling=> inside userdeifned class)

//2.method definition/create(for now, calling=> inside userdeifned class)

//3.method calling/use(for now, calling=> inside main)
