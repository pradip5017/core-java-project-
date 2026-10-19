package inheritance;

class Person14{
	
	int id;
	String name;
	String add;
	
	void put(int id, String name, String add)
	{
		this.id=id;
		this.name=name;
		this.add=add;
		
	}
	
}
		class Person1 extends Person14{
			
			String course="MCA";
			
			void disp()
			{
				
				System.out.println("Person id="+id);
				System.out.println("Person name= "+name);
				System.out.println("Person name= "+add);
				System.out.println("Person name= "+course);
			}
		}


public class Single_Level_inheritance_Using_PrivateMidifier_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person1 p1 = new Person1();
		p1.put(11, "pradip", "pune");
		p1.disp();

	}

}
