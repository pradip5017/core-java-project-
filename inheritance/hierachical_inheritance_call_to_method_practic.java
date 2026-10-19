package inheritance;

class Practic
{
	int a,b;
	
	void getDatails(int a, int b)
	{
		this.a=a;
		this.b=b;
	
	}
	
	void show()
	{
	
		System.out.println("practices for hierachical inheritance");
	}
}


class addd extends Practic
{
	void add1()
	{
		
		System.out.println("The Addition is ="+(a+b));
	}
}

class subb extends Practic
{
	void sub1()
	{
		
		
		System.out.println("The subtraction is ="+(a-b));
	}
}

class mull extends Practic
{
	void mul1()
	{
		System.out.println("Multiplication is ="+(a*b));
	}
}

public class hierachical_inheritance_call_to_method_practic {
	
	public static void main(String args[])
	{
		Practic p1 = new Practic();
		p1.getDatails(2, 8);
	
		p1.show();
		
		
		addd a1= new addd();
		a1.getDatails(56, 65);
			a1.add1();
				
				
	subb s1 = new subb();
	s1.getDatails(88, 54);
	s1.sub1();
	
	
	mull m1 = new mull();
	m1.getDatails(565, 767);
	m1.mul1();
		
		
	}
	



}
