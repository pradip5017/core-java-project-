package polymorphism;


class Overriding
{
	void add(int a, int b)
	{
		System.out.println("the addition is "+(a+b));
	}
	
	void add(int a, float b)
	{
		System.out.println("the addition is "+(a/b));
	}
}


public class Method_Overloading_prac {
	public static void main(String args[])
	{
		Overriding o1 = new Overriding();
		o1.add(4, 6);
	}

}
