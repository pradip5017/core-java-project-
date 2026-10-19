package Encapsulation;
	class Emp1
	{
		private int id;
		private String name;
		private String address;
		
		void setId(int id)
		{
			this.id=id;
		}
		
		int getId()
		{
			return id;
		}
		void setName(String name)
		{
			this.name =name;
		}
		String getName()
		{
			return name;
		}
		void setAddress(String address)
		{
			this.address=address;
		}
		String getAddress()
		{
			return address;
		}
		
	}
public class EncapsulationProgram_Practice {
	public static void main(String args[])
	{
		Emp1  e1 = new Emp1();
		e1.setId(1);
		e1.setName("Pradip");
		e1.setAddress("Pune");
		System.out.println("Emp Id :"+e1.getId());
		System.out.println("Emp Name :"+e1.getName());
		System.out.println("Emp Address :"+e1.getAddress());
	}

}
