package ToString_method;

class Emp {
	
	int id;
	String name;
	
	double sal;
	
	Emp(int id, String name, double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	
	String printinData()
	{
		return id+"\n"+name +"\n"+sal ;
	}
}

public class ToString_method {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(11, "pradip", 50000);
		
		System.out.println(e1.printinData());  //whenever we are going to print an object of class directly it automatically calls toString() method
        //hashCode=>@626b2d4a  //hashcode is unique positive integer number assigned by the JVM to each object stored in memory 
		  
//Object => java.lang //supermost class of all the classes in java means by default each class extends Object as a parent class
//Class => java.lang

		

		
	}

}
