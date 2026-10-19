package Static_keyword;

	class Person {
		
		int id;
		String name;
		static String company;
		
		Person(int id, String name)
		{
			this.id=id;
			this.name=name;
		}
		
		void show()
		{
			System.out.println("Employee id is ="+id);
			System.out.println("Employee name ="+name);
			System.out.println("Employee company ="+company);
		}
		
		static {
			company="tcs";
		}
	}

public class Static_block_practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(11,"pradip");
		p1.show();
		System.out.println("\n");
		Person p2 = new Person(12,"Vishal");
		p2.show();
		
		System.out.println("\n");
		Person p3 = new Person(13,"Rahul");
		p3.show();
		
		
	}

}
