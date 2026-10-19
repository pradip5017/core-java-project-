package inheritance;

//hierachical inheritance 

// practic => Addtion , Subtraction , Multiplication , Division 

class Practic1
{
	int a,b;
	
	Practic1(int a, int b)
	{
		this.a=a;
		this.b=b;
	
	}
	
	void show()
	{
	
		System.out.println("practices for hierachical inheritance");
	}
}


class addd1 extends Practic1
{
	addd1(int a, int b)
	{
		
		super(a,b);
	}
	void add1()
	{
		
		System.out.println("The Addition is ="+(a+b));
	}
}

class subb1 extends Practic1
{
	subb1(int a, int b)
	{
		
		super(a, b);
	}
	void sub1()
	{
		
		System.out.println("The Addition is ="+(a-b));
	}
}

class mull1 extends Practic1
{
	mull1(int a, int b)
	{
		super(a, b);
		
	}
	void mul1()
	{
		
		System.out.println("The Addition is ="+(a*b));
	}
}
public class hierachical_inheritance_Call_to_Constructo_practic {
	public static void main(String args[])
	{
		Practic p =new Practic();
		p.show();
		
		addd1 p1 = new addd1(2,4);
		p1.add1();
		
		subb1 s1 = new subb1(4,7);
		s1.sub1();
		mull1 m1 = new mull1(34,8);
		m1.mul1();
	
		
		
		
		
		
	}
	

}
