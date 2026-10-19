package Interview_Question_practice;

public  class Static {

	void put()
	{
		System.out.println("This is a method");
	}
	static class Abc{
		void get()
		{
			System.out.println("Thie static metthod");
		}
	}
	
	public static void main(String args[])
	{
		Abc s1 = new Abc();
		s1.get();
		
				
	}

}
