package polymorphism;
class Emp

//Java String toString() Method The toString() method returns the string itself. 
//object is a super class of all class in java 
//Object => java.lang //supermost class of all the classes in java means by default each class extends Object as a parent class
//Class => java.lang
{
	int id;
	String name;
	double sal;       //instance variable
	
	Emp(int id, String name, double sal) // parameterize constructor
	{
		this.id= id;
		this.name=name;
		this.sal=sal;     //declation variable of instace variable 
	}
	
	public String toString() //toString class
	{
		return id+"\n"+name+"\n"+sal+"\n";  //child class display toString class 
	}
	
}
public class ToString_method {
	public static void main(String args[])
	{
		Emp e1 = new Emp(11, "Pradip", 92000.5); // toString class 
		System.out.println(e1); //whenever we are going to print an object of class directly it automatically calls toString() method
        //hashCode=>@626b2d4a //hashcode is unique positive integer number assigned by the JVM to each object stored in memory 
        
		
//Object => java.lang //supermost class of all the classes in java means by default each class extends Object as a parent class
//Class => java.lang
		
	}
}
