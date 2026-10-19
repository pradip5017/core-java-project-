package object_class;


//clone/copy
//Constructors
//1.default
//2.Parameterized
//3.Copy/object cloning => copy one object into another 
//but we don't have copy constructor in java..instead, we have object cloning in java

//object cloning is the process of creating an exact copy of one object into another object


//1.Marker/blank => zero abstract method
//2.Functional/Single Abstract Method/=> one abstract method

//Q.Why we have marker interfcaes in java OR what is the use of marker interafaces?
//=> marker interfcaes are used to provide an extra information about class and object to the compiler
//e.g Cloneable...... provides information to the compiler that programmer wants to clone an object of specified class 


//There are certain requirements to perform an object cloning

//requirement 1=>the class whose object we wants to clone,with that class we need to implements Cloneable interface
//Cloneable
//Cloneable is marker interface bcz,it don't have any methods





//-------------------------------------------------------------------------


/*class Cloneable{
	
}*/

class Emp implements Cloneable {
	
	int id; 
	String name;
	double sal;
	
	Emp(int id, String name, double sal){
		
		this.id=id;
		this.name=name;
		this.sal=sal;
		
		
	}
	
	public String toString()
	{
		return "Emp [id = " +id + " , name= "+name +"  salary = " +sal +"]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class object_clonning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1 = new Emp(11, "pradip", 500000);
		
		System.out.println(e1);

	}

}
