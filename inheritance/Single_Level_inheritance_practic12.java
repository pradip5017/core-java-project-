package inheritance;

	class Man{
		
		int id;
		String name;
		String add;
		
		Man(int id, String name, String add)
		{
			this.id=id;
			this.name=name;
			this.add=add;
		}
		void put()
		{
			System.out.println("Man id id = "+id);
			System.out.println("Man name is = "+name);
			System.out.println("Man address is = "+add);
		}
		
		
	}
	
	class People1 extends Man {
			
		People1(int id, String name, String add)
		{
			super(11,"Vishal","pune");
			
			this.id=id;
			this.name=name;
			this.add=add;
		}
		
		
		void get()
		{
			System.out.println("Man id id = "+id);
			System.out.println("Man name is = "+name);
			System.out.println("Man address is = "+add);
		}
		
	}

public class Single_Level_inheritance_practic12 {
	public static void main(String args[])
	{
		
		Man m1 = new Man(11,"Vishal","pune");
		m1.put();
		
		People1 p1 = new People1(12,"pradip","pune");
		p1.get();
		
		
	}

}
