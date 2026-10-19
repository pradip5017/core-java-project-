 package Encapsulation;
//Encapsulation=> setter,getter(with return statement),abstraction,inheritance,polymorphism

//1.purpose  => to provide security to the data
//2.definition  => Encapsulation is the [process of binding/wrapping data members(instance variable) or
//member function(instance method) together inside one single unit/class

//3.e.g capsule, CD, 
//4.how to implement?  =>
 //1.to declare all the instance variable of a class as a private
// 2.needs to create setter and getters(methods) for each
//and every instance variable of a class




/*Setters and getters are the conventional/traditional methods of a java in   
* which setters are used to set/initialize/change
* 
the value of instance variable whereas getters are used to get the value of 
instance variable

and through setters and getters we can set or get the values separately rather 
than setting and getting it by using one single method(like accept)

*/

/*why we need to create setter and getters?
=> through the setter and getters we can initialize single property of an
object at a time so that the property will be more secure*/


class Teacher
{
	private int id;
	private String name;
	private String address;
	
	void setId(int id)
	{
		this.id=id;
	}
	
	void setName(String name)
	{
		this.name= name;
	}
	
	void setAddress(String address)
	{
		this.address = address;
	}
	
	int getId()
	{
		return id;
//		System.out.println(id);
	}
	
	String getName()
	{
		return name;
	}
	
	String getAddress()
	{
		return address;
	}
}

public class Incapsulation_program_practic {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setId(22);
		t1.setName("Pradip");
		t1.setAddress("Beed");
		
		System.out.println("The Teacher id is ="+t1.getId());
		System.out.println("The Teacher name is ="+t1.getName());
		System.out.println("The Teacher address is ="+t1.getAddress());
		
		
	}

}
