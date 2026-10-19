package Encapsulation;
 class Employee
 {
	 int id =1;
	 String name ="pradip";
	 String address ="pune";
	 
	  void setId(int id)
	 {
		 this.id=id;
	 }
	 
	 int getId()
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
	 void setAddress(String address)
	 {
		 this.address=address;
	 }
	 String getAddress()
	 {
		 return address;
	 }
 }

public class InterViewQuesion {
	public static void main(String[] args) {
		
	Employee  e = new Employee();
//	e.setId(12);
//	e.setName("hrushikesh");
//	e.setAddress("pune");
	System.out.println("id :"+e.getId());
	System.out.println("Name :"+e.getName());
	System.out.println("Address :"+e.getAddress());
	
	}

}
