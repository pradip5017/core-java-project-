package Encapsulation;

	class Emp {
		private int id;
		private String name;
		private String address;
		
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
			this.address=address;
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
public class Encapsulation_program_practice4 {
	public static void main(String args[])
	{
		Emp e1 = new Emp();
		e1.setId(1);
		e1.setName("Pradip");
		e1.setAddress("pune");
		
		System.out.println("Emp id :"+e1.getId());
		System.out.println("Emp Name :"+e1.getName());
		System.out.println("Emp Address :"+e1.getAddress());
	}

}
