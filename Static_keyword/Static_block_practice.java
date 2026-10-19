package Static_keyword;

class Emp100{
	
	int id;
	String name;
	static String company;
	
	
	Emp100(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println("Employee id is ="+id);
		System.out.println("Employee name is ="+name);
		System.out.println("Student Company is ="+company);
	}
	
	static {
		company="Mahindra Tech Soft";
	}
	
}



public class Static_block_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp100 e1 = new Emp100(11, "pradip");
		e1.display();
		System.out.println("\n");
		
		Emp100 e2 = new Emp100(12, "Vishal");
		e2.display();
		
		System.out.println("\n");

		
		Emp100 e3 = new Emp100(13, "Kishor Sir");
		e3.display();
		
		
	}

}
