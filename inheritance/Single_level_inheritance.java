package inheritance;

//1.purpose  => used to achieve code reuseability
//2.definition => it is the process of deriving/accessing/inheriting the properties of one class(parent class) to another class(child class)
//3.e.g   parent and child relationship
//4.how to implement?
   //by creating parent and child class
//5.program
//types of inheritance
//1.single level(can be achieve through the classes)
//in which we have exactly 2 classess..one is parent and second is child class
//2.multilevel(can be achieve through the classes)
//3.hierarchical(can be achieve through the classes)
//4.multiple(can NOT be achieve through the classes, and hence we have the concept of interface in java)


//WAP that implements single level inheritance by creating setters and getters for the instance variable defined in parent and child
//Person => Parent/Super/Base/Old class


class Person
{
	int age;
	String name;  //instance variable
	String address;
	
	void eat()  //method
	{
		System.out.println("Shubham is eating a food please do not dusturb to shubham.."); //simple massage passs
	}
	

}

class Student54 extends Person   //Student=> Child/Sub/Derived/New class
{
	double marks;
	
	Student54(int age, String name, String address, double marks) //paramitric constructor 
	{
		this.age=age;  //here, this.age, this.name, this.address are inheriting from parent class Person
		this.name=name;
		this.address=address;
		this.marks=marks;
	}
	
	void display()// method 
	{
		System.out.println("Student age is ="+age);
		System.out.println("Student name is ="+name);
		System.out.println(" Student address is ="+address);  //value asssign
		System.out.println("Student age masksis ="+marks);
	}
}
public class Single_level_inheritance {
	
	public static void main (String args[])
	{
		Student54 s1 = new Student54(11, "pradip", "Pune", 78.6); //constructor is not create a obj so assign a value to paramatarize code..
		s1.eat();
		s1.display();
		
		
	}

}
