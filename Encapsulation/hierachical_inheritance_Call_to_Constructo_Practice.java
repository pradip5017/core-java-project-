package Encapsulation;

class  Math{
	int a;
	int b;
	
	Math (int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}
	
	class Additions extends Math {
		
		Additions(int a, int b)
		{
			super(a,b);
		}
		
		void add() {
			System.out.println("Addition is="+(a+b));
		}
		
	}
	
	class Multiplications extends Math{
		
		Multiplications(int a, int b)
		{
			super(a, b);
		}
		void mul()
		{
			System.out.println("Multiplication is ="+(a*b));
		}
	}
	
	class Division extends Math{
		Division(int a, int b)
		{
			super(a,b);
		}
		void Div()
		{
			System.out.println("Division is ="+(a+b));
		}
	}

public class hierachical_inheritance_Call_to_Constructo_Practice {
	public static void main(String args[])
	{
		Additions a1 = new Additions(10,10);
		a1.add();
		
		Multiplications m1 = new Multiplications(20,43);
		m1.mul();
		
		Division d1 = new Division(10,30);
		d1.Div();
		
	}

}
