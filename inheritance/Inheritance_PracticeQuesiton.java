package inheritance;

	class Student11
	{
		void  put(String name)
		{

			System.out.println(" My name is pradip :"+name);
	
		}
	}
	
	class Emp11 extends Student11
	{
		void course()
		{
			super.put("");
			System.out.println(" Iam Java full stack developer :");
		}
	}
public class Inheritance_PracticeQuesiton {
	public static void main(String[] args) {
		
		Emp11 e = (Emp11) new Emp11();
		e.put("");
		e.course();
		
				
	}

}
