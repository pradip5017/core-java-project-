package Abstraction;
	abstract class Emp11
	{
		int id;
		String name; 
		String address;
		
		Emp11(int id, String name, String address)
		{
			this.id=id;
			this.name=name;
			this.address=address;
		}
		void put()
		{
			System.out.println("Emp id:"+id);
			System.out.println("Emp Name :"+name);
			System.out.println("Emp Address :"+address);
		}
		abstract void get();
		
		abstract void Emp();
	}
	
	class Emp12 extends Emp11
	{
		Emp12(int id, String name, String address)
		{
			super(11,"Pradip Rathod ","pune");
		}
		void get()
		{
			System.out.println("Getting of Data..!!");
		}
		void Emp()
		{
			System.out.println("Employee of The Year :"+name);
		}
	}
public class Abstract_Class_Practice13 {
	public static void main(String[] args) {
		
		Emp12 e1 = new Emp12(1, "Rahul", "pune");
		e1.put();
		e1.get();
		e1.Emp();
		
	}

}
