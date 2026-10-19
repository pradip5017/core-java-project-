package Encapsulation;



	class Student10{
		private int id;
		private String name;
		private String add;
		
		void setId(int id)
		{
			this.id=id;
		}
		
		void setName(String name)
		{
			this.name=name;
		}
		
		void setAdd(String add)
		{
			this.add=add;
		}
		
		int getId()
		{
			return id;
		}
		
		String getName()
		{
			return name;
		}
		String getAdd()
		{
			return add;
		}
	}

public class Encapsulation_program_practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student10 s1 = new Student10();
		s1.setId(11);
		s1.setName("Pradip");
		s1.setAdd("Pune");
		
		System.out.println("Student id = "+s1.getId());
		System.out.println("Student name = "+s1.getName());
		System.out.println("Student Address = "+s1.getAdd());
		
		System.out.println("\n secound Student Details..\n");
		
		Student10 s2 = new Student10();
		s2.setId(12);
		s2.setName("Vishal");
		s2.setAdd("Pune");
		
		System.out.println("Student id = "+s2.getId());
		System.out.println("Student name = "+s2.getName());
		System.out.println("Student Addtess ="+s2.getAdd());
		
		
	}

}
