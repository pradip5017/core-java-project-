package polymorphism;
//Polymorphism  => poly(many) + morphs(forms)
//1.purpose=>  using one object in different ways
//2.definition => means using one object in multiple ways
 //OR one object is having multiple forms is called as polymorphism

//3. e.g person=>person may be a family member,strudent,frnd,emp,dr
//4.How to implement?
//by using the concept of method overloading and overriding...we can implement concept of polymorphism
//5.Program


//Types of polymorphism
//1.Compile time poly/early binding/static binding/static dispatch process
 //multiple methods having same name but with different parameter list
//method overloading can be possible by changing the number of arguments or 
//by changing types of argument 
//but method overloading is not possible by changing the return type of the method
class Overloading1
{
	void add(int a, int b)
	{
		System.out.println("the addtion is="+(a+b));
	}
	
	void add(int a, float b)
	{
		System.out.println("the subtraction is="+(a-b));
	}
}
public class Method_Overloading_practic {
	public static void main(String args[])
	{
		Overloading1 o1 = new Overloading1();
		o1.add(10, 10);
		
		Overloading1 o2 = new Overloading1();
		o2.add(10, 10.5f);
		
		
	}

}
