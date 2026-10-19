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

class Emp5 implements Cloneable  // extend Object => Clone ();
{
	int id;
	String name;
	double sal;
	
	Emp5(int id, String name, double sal) 
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() { // toString is convert object to string and desclate in instance variable in inner class
		return "Emp5 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	//requirement 2=> Override clone method from an Object class
	public Object clone() throws CloneNotSupportedException  //requirement 3=> handle CloneNotSupportedException which is thrown by clone() method
	{
		return super.clone();  //calling clone() method of super/Object class
	}
	
}

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Emp5 e1 = new Emp5(11,"praidp", 545.6);
		System.out.println("e1 ="+e1);
		
		
//		//Q.Can we create an object in java without using new keyword?
		//=>yes....by using object cloning concept
		
		Emp5   e2=(Emp5) e1.clone();  //Cloneable interface comes under => java.lang
		
		System.out.println("e1 ="+e2);
		
	
		
	}

}
