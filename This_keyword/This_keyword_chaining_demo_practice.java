package This_keyword;

//this is a method chaining Program for practice purpose
	class Studee11{
		int id;
		String name;
		String add;
		
		
		
		Studee11()
		{
			this(13,"Jiavan", "Beed");
			System.out.println("Defualt constructor for property= id and Name and Address");

			id=11;
			name ="Pradip";
			add ="Pune";
			
			System.out.println("Student id = "+id);
			System.out.println("Student name = "+name);
			System.out.println("Student address = "+add);
			
			
		}
		
		Studee11(int id, String name, String add)
		{
			this(12,"Amol");
			System.out.println("Praramiteric constructor for property= id and Name and Address");

			id=id;
			name=name;
			add=add;
			
			
			System.out.println("Student id = "+id);
			System.out.println("Student name = "+name);
			System.out.println("Student address = "+add);
			
		
		}
		
		Studee11(int id, String name)
		{
			this("Vishal", "pune");
			System.out.println("Praramiteric constructor for property= Id and Name");

			this.id=id;
			this.name=name;
			
			System.out.println("Student name = "+id);
			System.out.println("Student name = "+name);
		}
		
		Studee11(String name, String add)
		{
			
			System.out.println("Praramiteric constructor for property= Name and Address");
			this.name=name;
			this.add=add;
					
			
			System.out.println("Student name = "+name);
			System.out.println("Student name = "+add);
					
		}
			
		
	}
	
	

public class This_keyword_chaining_demo_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Studee11 s1 = new Studee11();
	}

}
