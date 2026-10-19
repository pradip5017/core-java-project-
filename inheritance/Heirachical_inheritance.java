package inheritance;

//In hierarchical inheritance,we have one parent class having multiple child classes is called as heirachical inheritance  
class Operation
{
	int a,b;
	
	
	void getvalue(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
}

class Add extends Operation
{
	void printAddtion()
	{
		System.out.println("The addtion is="+(a+b));
	}
}

class Sub extends Operation
{
	void printSubtraction()
	{
		System.out.println("The subtraction is ="+(a-b));
	}
}

class Mul extends Operation
{
	void printmultiplation()
	{
		System.out.println("The subtraction is ="+(a*b));
	}
}

public class Heirachical_inheritance {
	public static void main(String args[])
	
	// In Hierarchical_inheritance, we need to create an object of each child class  
		  ///and that each child class object can able to call parent class data
	
	{
		Add a1 = new Add();
		
		a1.getvalue(3, 5);
		a1.printAddtion();
		Sub s1 = new Sub();
		
		s1.getvalue(5, 7);
		s1.printSubtraction();
		
		
		
		
		Mul m1= new Mul();
		
		m1.getvalue(4, 7);
		m1.printmultiplation();
	}

}
