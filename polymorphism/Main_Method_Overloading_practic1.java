package polymorphism;

public class Main_Method_Overloading_practic1 {
	
	
	
	public static void main11(int art)
	{
		System.out.println("This is a integer main method");
	}
	
	public static void m1(boolean[] ar)
	{
		System.out.println("This is a boolean main method");
	}
	public static int main1(int id)
	{
		System.out.println("This is a return type is int ");
		return id;
	}

	public static void main(String args[])
	{
		System.out.println("This is a main method");
		
		Main_Method_Overloading_practic1 m1 = new Main_Method_Overloading_practic1();
		m1.main1(1);
		m1.main11(12);
		m1.m1(null);
		
	}
}
