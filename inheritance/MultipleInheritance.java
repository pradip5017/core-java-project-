package inheritance;

	class A
	{
		void a1()
		{
			System.out.println("this is a A1 Method in A class :");
		}
	}
	class B extends A
	{
		void b1()
		{
			
			System.out.println("This is a b1 method in B class :");
		}
		
	}
	
	class C  extends B
	{
		static void c1()
		{
//			A a1 = new A();
//			a1.a1();
//			B b1 = new B();
//			b1.b1();
			System.out.println("This is a c1 method in c class :");
		}
	}
public class MultipleInheritance {
	public static void main(String[] args) {
		
//		A  a = new A();
//		a.a1();
//		
//		
//		B b= new B();
//		b.b1();
//		
		C c = new C ();
		c.a1();
		c.b1();
		c.c1();
		
		
		
	}

}
