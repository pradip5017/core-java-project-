package Static_keyword;

  class Employees1{
	 
	    int id =1;
		String name ="pradip";
		static String college ="sb College";
		
		Employees1(int id, String name, String college)
		{
			this.id=id;
			this.name=name;
			this.college=college;
		}
		 void put()
		 {
			 System.out.println("Employee id :"+id);
			 System.out.println("Employee name :"+name);
			 System.out.println("Employee address :"+college);
		 }
		 
		 static
		 {
			 System.out.println("Static block");
			 college ="Suraj College Beed";
		 }	
 }
public class Static_block_Practice1 {
	public static void main(String args[])
	
	{	
		Employees1 e1 = new Employees1(1,"pradip","Sb College beed");
		e1.put();
	}

}
