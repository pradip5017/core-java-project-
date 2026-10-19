package inheritance;

	class Student12
	{
		void eat(String docName)
		{
			System.out.println(" I Am Eating Food ..!!"+docName);
		}
		
	}
	
	class Emp12
	{
		void put()
		{
//			Student12 s = new Student12();
//			s.eat("My name is pradip Rathod..!!");
			System.out.println(" Rahul is Eating Food..!!");
		}
	}
public class Relationaship {
	public static void main(String[] args) {
		
		Emp12 e	 = new Emp12();
		e.put();
				
	}

}
