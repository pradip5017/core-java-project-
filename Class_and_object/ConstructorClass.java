

//constructor => Constructor is a special type of method which is used to
      
//initialize an object
//1.Constructor name should always be SAME and class name
//2.Constructor  does not have a return type,not even void
//3.Constructor should always be called at a time of object creation
//4.Constructor should never be called by using object and dot operator

//method
//1.Method name should always be different from class name
//2.method should should always have a return type
//3.method should always be called AFTER object creation
//4.Method should always called by using object and dot operator

//types of constructor
//types of constructor
//1.parameterized constructor
//2.default/non-parameterized/no-arg constructor
//3.copy constructor(in c++)/object cloning(in java)


package Class_and_object;

class Student5
{
	int id;
	String name;
	String college;
	String address;
	double mark;
	
	
	
	Student5(int a, String b, String c, String d, double e)  //paramiter constructor
	{
		id = a;
		name = b;
		college = c;
		address = d;
		mark = e;
		
	}
	
	Student5()//default constructor
	{
//		System.out.println("Hello");
		
		id = 78;
		name = "jivan";
		college = "Adity College";
		address = "beed";
		mark = 67.6; 
		
	}
	
	void putData() {
		System.out.println("The Student ID is ="+id);
		System.out.println("The Student name is ="+name);
		System.out.println("The Student college is ="+college);
		System.out.println("The Student address is ="+address);
		System.out.println("The Student mark is ="+mark);
	}
	
}





public class ConstructorClass {
	
	public static void main(String args[])
	{
		Student5 p = new Student5(33, "Pradip", "Sb college", "chh. Sambhaji nagar", 65.6);
		p.putData();
		Student5 u = new Student5();
		u.putData();
		
		
	}

}



//constructor => Constructor is a special type of method which is used to 
//initialize an object
//1.Constructor name should always be SAME name of  class name
//2.Constructor  does not have a return type,not even void
//3.Constructor should always be called at a time of object creation
//4.Constructor should never be called by using object and dot operator

//method
//1.Method name should always be different from class name
//2.method should  always have a return type
//3.method should always be called AFTER object creation
//4.Method should always called by using object and dot operator

//types of constructor
//types of constructor
//1.parameterized constructor
//2.default/non-parameterized/no-arg constructor
//3.copy constructor(in c++)/object cloning(in java)
