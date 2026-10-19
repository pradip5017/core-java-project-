package final_keyword;

 class Parent1
{
	void get()
	{
		System.out.println("Hello everyone..!!");
	}
	
	void put()
	{
		System.out.println("Hi iam put data method..!!");
	}
}

 final class Child1 extends Parent1   // final keyword is perform to fixed value of class    fixed value assign of final keyword
{
	void put()
	{
		super.put(); // using super keyword to call parent class put method
		System.out.println("Child class put data..!!");
	}
}
public class Final_keyword_with_class_Practic {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.get();
		c1.put();
		
		
		
		
	}

}
