package Interface_Programs;

//types of interfaces
//builtin interface => Cloneable, Serializable,ActionListener, Predicate

//1.marker interface/empty
//which is having ZERO abstract method
//2.Single Abstract Method(SAM)/functional interface
//which is having exactly ONE abstract method
//Anonymous(nameless) =>
//there are 2 ways to create class and object
//1.First create a class then create an object
//2.First create an object then create a class
//functional interface


interface Test1  //functional interface
{
	public void add(int a, int b); //declations 
	
	
}
public class Anonymous_inner_class11 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1()  //here,i1 is not an object of Test1(bcz,it is an interface )...i1 is an object of anonymous inner class
				
				{
			//Anonymous inner class => the class which does not have any name is called as "anonymous inner class"
			//the purpose of Anonymous inner class is to implement interfaces
			
				public void add(int a, int b) //defination 
				{
					System.out.println("the addition is="+(a+b));  // print A and B values 
				}
				};
				t1.add(5, 6);   //obj define
				
		

	}

}
