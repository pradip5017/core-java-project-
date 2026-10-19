	package Interface_Programs;
	
	
	interface Parent1
	{
		public void add();
		
	}
	
	interface child1  extends Parent1
	{
		public void sub();
	}
	
	class  Imp implements child1
	{
	
		
		public void add() {
			System.out.println("the add is=");
			
		}
	
		
		public void sub() {
			System.out.println("the sub is=");
			
		}
		 
	}
	
	public class interface_extends_interface_practic {
		public static void main(String args[])
		{
			Imp i1 = new Imp();
			i1.add();
			i1.sub();
		
		}
	}
