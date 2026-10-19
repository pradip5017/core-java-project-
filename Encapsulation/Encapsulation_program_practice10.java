package Encapsulation;


	class Company{
		
		int id ;
		String name;
		String address;
		
		
		void setId(int id)
		{
			this.id=id;
		}
		void setName(String name)
		{
			this.name=name;
			
		}
		void setAddress(String address)
		{
			this.address = address;
		}
		
		int getId()
		{
			return id;
		}
		String getName()
		{
			return name;
		}
		String getAddress()
		{
			return address;
		}
	}

public class Encapsulation_program_practice10 {
	public static void main(String args[])
	{
		Company c1 = new Company();
		c1.setId(11);
		c1.setName("pradip");
		c1.setAddress("pune"); 
		
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getAddress());
		
		
		System.out.println("\nSEcount Employees..!!\n");
		
		Company c2 = new Company();
		c2.setId(12);
		c2.setName("Shubham");
		c2.setAddress("Pune");
		
		System.out.println("The Id is ="+c2.getId());
		System.out.println("The Name  is ="+c2.getName());
		System.out.println("The Address is ="+c2.getAddress());
				
		
	}

}
