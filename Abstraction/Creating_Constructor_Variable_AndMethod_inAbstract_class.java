package Abstraction;
abstract class Fruit
{
	int price;
	
	Fruit()
	{
		this(33);  //Creating_constructor_variable_and_method_in_abstract_class
		price= 56;
		System.out.println("Defualt constructor.."+price);
	}
	
	Fruit(int price)
	{
		this.price=price;
		System.out.println("paramitarized constructor..."+price);
	}
	abstract void peel();
	
	void buy()
	{
		System.out.println("Buy the manoey..");
	}
}
	class Apple extends Fruit
	{
		void peel()
		{
			System.out.println("In abstract method..:peel()");
		}
	
}


public class Creating_Constructor_Variable_AndMethod_inAbstract_class {
	
	public static void main(String args[])
	{
		Apple a1 = new Apple();
		
		a1.buy();
		a1.peel();
		
		//this default constructor of an abstract class will get called automatically
		//calling to parameterized constructor ..jumps on line no 15
	}

}
