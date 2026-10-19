package Abstraction;

	abstract class Employee01{
		int id;
		String name;
		String address;
		
		Employee01(int id, String name, String address)
		{
			this.id= id;
			this.name=name;
			this.address=address;
		}
		
		void EmpDetails()
		{
			System.out.println("Employee Id : "+id);
			System.out.println("Employee Name :"+name);
			System.out.println("Employee Address :"+address);
		}
		abstract void Education();
		
		abstract void College();
		abstract void put();
	}
	
	class Emp extends Employee01
	{
		Emp(int id, String name, String address)
		{
			super(id, name, address);
		}
		
		void College()
		{
			System.out.println("Master Degress : Suraj collelge Beed");
			System.out.println("Bachelor Degree : Sbes College of Science Chh. Sambhaji nagar");
			System.out.println("Course : Seven mentor Training Intitute Pune");
			
		}
		void Education()
		{
			System.out.println("MCA");
			System.out.println("BCS");
			System.out.println("Java full stack developer..!!");
		}
		void put()
		{
			System.out.println("Putting of data..!!");
		}
	}
public class Abtraction_Program_practice4 {
	public static void main(String args[])
	{
		Emp e1= new Emp(1,"pradip","pune");
		e1.EmpDetails();
		e1.College();
		e1.Education();
		e1.put();
		
		
	}
}
