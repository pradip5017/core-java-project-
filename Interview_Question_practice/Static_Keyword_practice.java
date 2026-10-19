package Interview_Question_practice;

	class Employee01 {
		int id ;
		String name;
		static String companyName ="TCS";
		
		Employee01(int id, String name)
		{
			this.id=id;
			this.name=name;
			
		}
		Employee01()
		{
			this.id =12;
			this.name="Shubham";
		}
		void putData()
		{
			System.out.println("Employee id is ="+id);
			System.out.println("Employee name is ="+name);
			System.out.println("Employee Company name is ="+companyName);
		}
		  static 
		{
		  companyName="Tech Mahindra";	
		}
	}
public class Static_Keyword_practice {
	public static void main(String args[])
	{
		Employee01 e1 = new Employee01(11,"pradip");
		e1.putData();
		
		Employee01 e2 = new Employee01();
		e2.putData();
	}

}
