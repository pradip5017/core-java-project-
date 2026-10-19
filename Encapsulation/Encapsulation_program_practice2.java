package Encapsulation;

//incapsulation practice
	class Emp10
	{
		 private int id;
		 private String name;
		 private String add;
		 
		 
		 public void setId(int id)
		 {
			 this.id=id;
		 }
		 public int getId()
		 {
			 return  id;
		 }
		  void setName(String name)
		  {
			  this.name=name;
		  }
		  String getName()
		  {
			  return name;
		  }  
		  void setAdd(String add)
		  {
			  this.add=add;
		  }
		  
		  String getAdd()
		  {
			  return add;
		  }
		  
		 
	}
public class Encapsulation_program_practice2 {

	public static void main(String[] args) {
		
		
		Emp10 e1 = new Emp10();
		
		e1.setId(11);
		e1.setName("pradip");
		e1.setAdd("pune");
		
		System.out.println("Emp id = "+e1.getId());
		System.out.println("Emp name = "+e1.getName());
		System.out.println("Emo address = "+e1.getAdd());
		
		
	}

}