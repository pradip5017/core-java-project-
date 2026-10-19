package inheritance;
	 class Emp1
	 {
		 int id=1;
		 String name ="pradip";
		 String address ="pune";
		 double salary;
		 Emp1(int id, String name, String address, double salary)
			{
				this.id=id;
				this.name= name;
				this.address=address;
				this.salary=salary;
				
			}
			void put1()
			{
				System.out.println("Enter Id :"+id);
				System.out.println("Enter Name :"+name);
				System.out.println("Enter Address :"+address);
				System.out.println("Enter Address :"+salary);
			}
			
		
	 }
public class inheritance_program_practice {
	public static void main(String args[])
	{
		Emp1 e1= new Emp1(1,"pradip","pune",45000);
		e1.put1();
		
	}

}
