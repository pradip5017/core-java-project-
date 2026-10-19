package polymorphism;

//Q.Can we overload main method?
//=>yes......we can overload main method...but out of that all the overloaded
//format of main,the only main will get execute which is having string[] args as an argument


public class Main_Method_Overloading {
	public static void main(int args[])
	{
		System.out.println("hi");
		System.out.println("hi this. method call to next method by String method");
	}
	public static void main(String args[])
	{
		int a[]= {6,6,6,6}; 	//defining  to int (datatype)method   // calling  to method 
		main(a); 				//from here it will jump on above method "public static void main(double[] args)"
		System.out.println("Hello");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			
		}
	}
	public static void main(double args[])
	{
		System.out.println("by");
	}
	public static void main(float args[])
	{
		System.out.println("helo jhdjkfh");
	}
	
}
