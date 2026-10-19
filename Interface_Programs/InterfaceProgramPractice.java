package Interface_Programs;

	interface Test01
	{
		void pay();
		
		void get();
		
		void put1();
	}
	
	 class User1 implements Test01
	{
		public void put1()
		{
			System.out.println("Putting of data");
		}
		public void get()
		{
			System.out.println("Geting of data..!!");
		}
		
		public void pay()
		{
			System.out.println("Pay Payment..!!");
		}
	}

public class InterfaceProgramPractice {
	public static void main(String[] args) {
		User1 t = new User1();
		t.put1();
		t.get();
		t.pay();
		
	}

}
