package final_keyword;

//Q.How we can create our own immutable(non-changeable) method?
//=>by declaring that method as a final

//final method=> the method which is decalred as a final cannot be override

class Animal1
{
//	final void run()                   //or  the method which is declared as a final cannot be override
	 void run()
	{
		System.out.println("in parent run() :");
	}
}
class Dog extends Animal1
{
  final	void run()    ///overridden method of parent class
	{
		super.run();
		System.out.println("in child run() : " );
	}
}

public class Final_Keyword_With_Method {
	public static void main(String args[])
	{
		Dog d1=new Dog();
		 d1.run();
	}
}
