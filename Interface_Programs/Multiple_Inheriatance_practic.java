	package Interface_Programs;
	
	
	interface Subject
	{
		public abstract void Math();
		
		void english();
		void Science();
	}
	
	abstract class Subject1 implements Subject
	
	{
		public void Math()
		{
			System.out.println("the subject is math");
		}
		
		public void english()
		{
			System.out.println("The subject is english");
		}
		
	}
	
	class Sub56 extends Subject1
	{
		public void Science()
		{
			System.out.println("the subject is science");
		}
		
		public boolean session()
		{
			return true;
		}
	
	
	
		
	}
	
	public class Multiple_Inheriatance_practic {
		public static void main(String args[])
		{
			Sub56 s1 = new Sub56();
			s1.Math();
			s1.english();
			s1.Science();
			System.out.println("the session is ="+s1.session());
		}
	
	}
