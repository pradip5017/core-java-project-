package Static_keyword;


//static use is a memory managemanet 

class Student14
{
	int id;
	String name;
	static String address;
	
	Student14(int id, String name )
	{
		
		
		this.id=id;
		this.name="name";
	}
	
	void Display()
	{
		System.out.println("Student informations\n");
		System.out.println("Student id is= "+id);
		System.out.println("Student Name is = "+name);
		System.out.println("Student address is = "+address);
		
	}
	
	{
		//defual constructor 
		
		System.out.println("\nThat is constructor...............\n");
		this.id=23;
		this.name="pradip";
	}
	
	static  // defual static keyword
	{
		
		System.out.println("\nAddress change..................\n ");
		address = "Beed";
	}
	
	void getDetail()
	{
//		System.out.println("Student informations\n");
		System.out.println("Student id is= "+id);
		System.out.println("Student Name is = "+"name");
		System.out.println("Student address is = "+address);
		
	}
	
}
public class Static_block_practic {
	public static void main(String args[])
	{
		Student14 p = new Student14(22, "Jivan");
		p.Display();
		
		Student14 u = new Student14(44, "Pradip");
		u.getDetail();
		
		
	}

}
