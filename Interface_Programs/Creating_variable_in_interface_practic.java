package Interface_Programs;
//whenever we are having,
//class to class relationship=> extends
//interface to class relationship=> implements
//interface to interface relationship=> extends




//1.interface =>  consists of only ABSTRACT(having declaration only) methods
//2.interface is used to achieve multiple inheritance and data abstraction in java 
//3.interface should always be implement in a class
//4 interface is a blue print of a class in define behavior of a class

interface Varr 
{
	//variables in interface are by default declared as public static final
	
	public static final int a = 98; //final/const=> non-changeable,static(common)=> changeable
//	int a=45;
	
	public abstract void show();
}

class Inter implements Varr
{

	@Override
	public void show() {
		System.out.println("The instance variable value is fixed="+a);
		
	}
	
}

public class  Creating_variable_in_interface_practic {
 public static void main(String srgs[])
 {
	 Inter i1 = new Inter();
	 i1.show();
 }
}
