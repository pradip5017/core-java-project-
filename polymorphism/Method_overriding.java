package polymorphism;
//**difference between method Overloading and Overriding class in java
//multiple methods having same name but with DIFFERENT parameter list  is overloading
//in method overloading ALL the methods must be defined in SAME classes

//2.run time poly/late binding/dynamic binding/dynamic dispatch process
//multiple methods having same name and with SAME parameter list
//in method overriding ALL the methods must be defined in DIFFERENT classes(means in child classes))

//OR method Overriding means re-defining the method of Parent class in child class


class Overriding01
{
	void add(int a, int b)
	{
		
		System.out.println("the addtion is="+(a+b));
	}
	
	
}

class ChildOverriding extends Overriding01
{
	void add(int a, int b)
	{
		super.add(10, 10);
		System.out.println("the subtraction is ="+(a-b)); //overring to call to child class
	}
}

public class Method_overriding {
	public static void main(String args[])
	{
		ChildOverriding o1 = new ChildOverriding();
		o1.add(10, 110);
//		o1.add(2, 4);
		
		//in case of overriding, both parent and child consists of same method but the 
		//child class method should always gets executes...
		//because at a runtime the child class method gets override on to the method of parent class thats why it is called as runtime poly..
	}

}
