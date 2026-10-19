package Interview_Question_practice;

 class  Static_class {
	
	void put()
	{
		System.out.println("This is a class");
	}
	
	static class  Abc
	{
		void Static1()
		{
			System.out.println("This is a Static 1 Method");
		}
		void Stat()
		{
			System.out.println("This is a static 2 mothod");
		}
		
	}
 
	
	public static void main(String args[])
	{
		Static_class s2 = new Static_class();
		s2.put();
		
		Abc s1 = new Abc();
		s1.Static1();
		s1.Stat();

		
	}

	}
