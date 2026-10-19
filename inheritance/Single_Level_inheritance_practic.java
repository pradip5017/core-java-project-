package inheritance;

class Employee2
{
	private int id;
	private String name;
	private String address;
	
	
	public int getId() {
		return id;// read perpose
	}
	public void setId(int id) {
		this.id =id;// write perpose
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;// value initilation 
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	void put()
	
	{
		System.out.println("Hi iam put method...");
	}

}

class HR extends Employee2


{
	
	
	private int id;
	private String name;
	private String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; // can not initialize values
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}


public class Single_Level_inheritance_practic {
	
	public static void main(String args[])
	{
//		Employee2 h2 = new Employee2();
//		h2.setId(12);
//		h2.setName("jiva");
//		h2.setAddress("Pune");
//		
//		
//		System.out.println("employess Details 1......\n");
//		System.out.println("Student id is="+h2.getId());
//		System.out.println("Student id is="+h2.getName());
//		System.out.println("Student id is="+h2.getAddress());
		
		
		
		HR h1 = new HR();
		h1.setId(11);
		h1.setName("jiva");
		h1.setAddress("Pune"); // write perpose
		
		
		System.out.println("\nemployess Details 2......\n");
		System.out.println("Student id is="+h1.getId());
		System.out.println("Student id is="+h1.getName());
		System.out.println("Student id is="+h1.getAddress()); // read prpose 
		
		
		HR h4 = new HR();
		h4.setId(13);
		h4.setName("Rahul");
		h4.setAddress("Chh. Sambhaji nagar");
		
		
		System.out.println("\nemployess Details 3......\n");
		System.out.println("Student id is="+h4.getId());
		System.out.println("Student id is="+h4.getName());
		System.out.println("Student id is="+h4.getAddress());
		
		
		HR h5 = new HR();
		h5.setId(55);
		h5.setName("pipoi");
		h5.setAddress("Chh. Sambhaji nagar");
		
		
		System.out.println("\nemployess Details 3......\n");
		System.out.println("Student id is="+h5.getId());
		System.out.println("Student id is="+h5.getName());
		System.out.println("Student id is="+h5.getAddress());
		
		
	}

}
