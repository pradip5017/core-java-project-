package polymorphism;


public class Main_Method_Overloading_practic {
	public static void main(double args[])
	{
		System.out.println("hi");
	}
	
	public static void main(int args[])
	{
		System.out.println("hello");
	}
	
	public static void main(float args[])
	{
		System.out.println("nice");
	}
	
	public static void main(String args[])
	{
		float b[]= {37}; // call to line number 15 
		int a[]= {8,5,5}; //call to line number 10
		main(a);
		main(b);
		System.out.println("you..");
	}
}
