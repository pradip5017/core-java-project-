package Interview_Question_practice;


	class Employee{
		int eid;
		String ename;
		static String eCompany;
		
		Employee(int eid, String ename)
		{
			this.eid=eid;
			this.ename=ename;
		}
		void putdata()
		{
			System.out.println("Employee Id is ="+eid);
			System.out.println("employee Name ="+ename);
			System.out.println("Employee company Is ="+eCompany);
		}
		
		static {
			eCompany="TCS";
		}
	}
public class Static_Keyword {
	public static void main(String srgs[])
	{
		Employee s1 = new Employee(1,"pradip");
		s1.putdata();
		
	}

}
