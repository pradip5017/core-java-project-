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

class Student1 implements Cloneable {
	
	int id ;
	String name;
	String add;
	
	
	Student1(int id, String name, String add){
		this.id=id;
		this.name=name;
		this.add=add;
	}
	
	public String toString () {
		return  "Student1 [id is = " +id    +" name is = " + name  +"  address is = "+add  +"]";
	}
	//requirement 2=> Override clone method from an Object class
	public Object clone() throws CloneNotSupportedException {  //requirement 3=> handle CloneNotSupportedException which is thrown by clone() method
		
		return super.clone(); //calling clone() method of super/object class.
		
	}
	
	
}
public class ObjectCloning_practice1 {
	
	public static void main(String args[]) {
		
		Student1 s1 = new Student1 (22, "pradip", "beed");
		
		//Q.Can we create an object in java without using new keyword?
				//=>yes....by using object cloning concept
				//Cloneable interface comes under => java.lang

		
		System.out.println(s1);
		
		Student1 s2 = new Student1 (23, "Jivan", "pachegaon");
		
		System.out.println(s2);
		
		
	}

}
