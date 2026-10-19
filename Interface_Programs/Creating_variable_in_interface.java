package Interface_Programs; 
//interface concept is to multiple inheritance

// interface is nothing but a abstract Class by using multiple inheritance 
//whenever we are having,
//class to class relationship=> extends
//interface to class relationship=> implements
//interface to interface relationship=> extends



interface Demo
{
	//variables in interface are by default declared as public static final
	public static final int  a=89;  //final/const=> non-changeable,static(common)=> changeable 
	public abstract void show();  
	int b=30;
	
}
//		child               parent
class  DemoImpl implements Demo
{
	public void show()
	{
		System.out.println("Access value of 'a' to paarent interface=>" +a );
	}
}

public class Creating_variable_in_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoImpl d1 = new DemoImpl();
		
		d1.show();
		
		
		DemoImpl d2 = new DemoImpl();
		d1.show();
		
		DemoImpl d3 = new DemoImpl();
		d3.show();
		

	}

}


// what is difference between abstract class and method
// abstract class can not create object because 
// abstrac class can access modifier  public, private , protected, and default
// abstract class can declare instance variable in abstract class
// abstract class can access abstract method and concreate method

//interface is nothing but a abstract class
// we can not create interface object can create object to implement another class and crate object 
// interface class we can not allow instance method
// interface is allow after java 8 feature , method private and default and static 
//interface is allow multiple inheritance 
//  we can desclar instance variable in interface  bydefault  consist public static final 

