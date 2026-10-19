package Class_and_object;


	 class Studentt11 {
		int id;
		String name;
		String add;
		
		Studentt11(int id, String name, String Add)
		{
			this.id=id;
			this.name=name;
			this.add=Add;
			
		}
		
		 Studentt11()
		{
			this.id=11;
			this.name="jivan";
			this.add="Beed";
		}
		
		void getdata()
		{
			System.out.println("Student id = "+id);
			System.out.println("Student name = "+name);
			System.out.println("Student Address = "+add);
		}
		
		
		
	}

public class ConstructorClass_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentt11 s1 = new Studentt11(12,"pradip","Pune");
		s1.getdata();
		
		System.out.println("Secound Record..!!");
		Studentt11 s2 = new Studentt11();
		s2.getdata();
		
		
		

	}

}
