package Class_and_object;

public class User {
	
	int id;
	String name;
	String  address;
	float age;
	

	
	public static void main(String args[])
	{
		User ram = new User();
		
		ram.id = 78; //function declation 
		ram.name = "ramkumar";
		ram.address = "pune";
		ram.age = 23.4f;
		
		
		System.out.println("--------1st block");
		
		System.out.println(ram.id); //function calling
		System.out.println(ram.name);
		System.out.println(ram.address);
		System.out.println(ram.age);
		
		User sham = new User();
		
		sham.id = 79;
		sham.name = "Sham";
		sham.address = "pune";
		sham.age = 22.4f;
		
		System.out.println("--------2nd  block");
		
		System.out.println(sham.id);
		System.out.println(sham.name);
		System.out.println(sham.address);
		System.out.println(sham.age);
		
		
		User gita = new User();
		gita.id = 80;
		gita.name = "gita";
		gita.address = "pune";
		gita.age = 22.4f;
		
		System.out.println("--------3rd block");
		System.out.println(sham.id);
		System.out.println(sham.name);
		System.out.println(sham.address);
		System.out.println(sham.age);
		
		
		
		
		
		
				
}

}
