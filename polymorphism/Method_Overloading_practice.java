package polymorphism;

	class Company{
		
		
		void company(String add, String ctype) {
			System.out.println("Company address and Company Type ="+(add +ctype));
		}
		void Employee(int a, int b)
		{
			System.out.println("The Department and employees="+(a+b));
		}
		
		void emp(int emp, String add)
		{
			System.out.println("Employees working in company  and Address = "+emp+add);
		}
	
	}
public class Method_Overloading_practice {
	public static void main(String args[])
	{
		Company c1 = new Company();
		c1.company("Pune", "Software developer");
		c1.Employee(6, 10);
		c1.emp(5, " pune");
	}

}
