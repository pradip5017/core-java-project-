package Abstraction;

	abstract class Company{
		
		void companyEmployee() {
			System.out.println("Company Employee is here in company..!!");
		}
		 abstract void companyId();//this is a abstract method in java
		
		abstract void companyAdd();
		
	
	}
	
	abstract class Employee11 extends Company
	{
		void companyId()
		{
			System.out.println("Company Id is use and know and company Employee");
		}
		
		abstract void companyDetails();
		
		void companyAdd()
		{
			System.out.println("Company Address is baner pune maharashtra..!!");
		}
	}

	class Student61 extends Employee11
	{
		void companyDetails()
		{
			System.out.println("Company details is = Software Company and software developer work in company company location is Baner Pune Maharashtra..!!!");
		}
		void Student()
		{
			System.out.println("Student is hire in company..!!");
		}
		
		void Me()
		{
			System.out.println("Iam Selected in this company = company name is = Tech Mahindra pvt ltd Baner Pune Maharashtra..!!");
		}
	}

public class Abstract_Class_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student61 s1 = new Student61();
		s1.companyId();
		s1.companyAdd();
		s1.companyDetails();
		s1.companyEmployee();
		s1.Student();
		s1.Me();
	}

}
