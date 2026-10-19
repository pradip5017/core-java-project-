package Encapsulation;

	class Human{
		int id;
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
public class Encapsulation_program_practice {
	public static void main(String args[])
	{
		Human h1 = new Human();
		h1.setId(1);
		h1.setName("pradip");
		h1.setAddress("Pune");
		System.out.println("Human id ="+h1.getId());
		System.out.println("Human name ="+h1.name);
		System.out.println("Human address ="+h1.address);
	}


	}
