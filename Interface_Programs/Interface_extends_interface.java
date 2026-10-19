	package Interface_Programs;
	
	interface Parent
	{
		void m1();
	}
	interface Child  extends    Parent    // two class interface to declare in extends keyword
	{
		void m2(); //and void m1();
	}
	class ParentChildImpl implements Child   // one class (class) name and another class (interface) name to use to implements keywords
	{
		@Override
		public void m1() {
			System.out.println("Method of Parent interface... ");
			
		}
	
		@Override
		public void m2() {
			System.out.println("Method of child interface... ");
			
		}
	}
	
	public class Interface_extends_interface {
		public static void main(String args[])
		{
		ParentChildImpl p1=new ParentChildImpl();
		p1.m1();
		p1.m2();

	}
	}