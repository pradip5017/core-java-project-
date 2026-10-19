package Class_and_object;

	class Employee{
		int id;
		String name;
		String address;
		String phone;
		
		Employee(int id, String name, String address, String phone)
		{
			this.id=id;
			this.name=name;
			this.address=address;
			this.phone=phone;
		}
		
		Employee()
		{
			this.id=12;
			this.name="Vishal";
			this.address="Pune";
			this.phone="9112828250";
		}
		void get()
		{
			System.out.println("Employee id = "+id);
			System.out.println("Employee name = "+name);
			System.out.println("Employee address = "+address);
			System.out.println("Employee phone number = "+phone);
		}
	}
public class Contractor_practice {	
	public static void main(String args[])
	{
		Employee e1 = new Employee(11,"pradip","Pune","7218089175");
		e1.get();
		Employee e2 = new Employee();
		e2.get();
		
	}

}
