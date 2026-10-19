package polymorphism;

class Overriding10
{
	void add(int a, int b)
	{
		System.out.println("the addition is="+(a+b));
	}
}

class child  extends Overriding10
{
	void add(int a, int b)
	{
		System.out.println("The subtraction is ="+(a-b));
	}
}

public class Method_Overriding_practic {
	public static void main(String args[])
	{
		child c1 = new child();
		c1.add(10, 10);
		//in case of overriding, both parent and child consists of same method but the 
		//child class method should always gets executes...
		//because at a runtime the child class method gets override on to the method of parent class thats why it is called as runtime poly..
		
//		child c2 = new child();
//		c2.add(10, 10);
	}

}
