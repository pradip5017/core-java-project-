package inheritance;

//subject => math. english. marathi, hindi

class Subject
{
	int a, b;
	
	Subject(int a, int b)
	{
		 this.a=a;
		 this.b=b;
	}
	
	void display()
	{
		System.out.println("All subject marks=\n");
	}
	
	
}

class math extends Subject


{
	math(int a, int b)
	{
		super(a,b);
	}
	
	void math1()
	{
		System.out.println("the math marks is ="+(a+b));
	}
}

class english extends Subject
{
	english(int a, int b)
	{
		super(a,b);
	}
	
	void eng()
	{
		System.out.println("The English number is="+(a-b));
	}
	
}

class marathi extends Subject
{
	marathi(int a, int b)
	{
		super(a,b);
	}
		void mara()
		{
			System.out.println("the marathi marks is ="+(a*b));
		}
	
}


class hindi extends Subject
{
	hindi(int a, int b)
	{
		super (a,b);
	}
	void hindi1()
	{
		System.out.println("the hindi marks is="+(a/b));
	}
}

public class hierachical_inheritance_Call_to_Constructo_practic1 {
	public static void main(String args[])
	{
		 math m1 = new math(56,5);
		 m1.display();
		 m1.math1();
		 
		 
		 english e1 = new english(56,5);
//		 e1.display();
		 e1.eng();
		 
		 
		 marathi m2 = new marathi(56,5);
//		 m2.display();
		 m2.mara();
		 
		 
		 hindi h1 = new hindi(56,5);
//		 h1.display();
		 h1.hindi1();
		 
		 
	}

}
