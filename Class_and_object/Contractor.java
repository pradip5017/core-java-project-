
//constructor => Constructor is a special type of method which is used to  set of block of codding
//initialize an object
//1.Constructor name should always be SAME as class name
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

package Class_and_object;

class Student{
	
	int rollno;
	String name;
	long phone;
	boolean isPresent;  // instance variable
	
	//parameterized constructor => in which we must have to pass a parameter
	
	void getData(int a, String b, long c, boolean d)
	{
		//default constructor => in which we don't have to pass any parameter

		rollno = a;  //assigning value of local variable x to the 
		name = b;
		phone = c;
		isPresent = d;
		 //assigning value of local variable x to the instance variable rollno

		
	}
	
	void putData()
	{
		System.out.println("Stude roll=" +rollno);
		System.out.println("Student Name = " +name);
		System.out.println("phone number="+phone);
		System.out.println("Is student present is session "+isPresent);
		
	}
}

public class Contractor{


public static void main(String args[]) {
	
	Student u1= new Student();
	//calling parameterized constructor
	
	u1.getData(66, "ram", 7219888l, true);
	u1.putData();
		
	
}

}




















