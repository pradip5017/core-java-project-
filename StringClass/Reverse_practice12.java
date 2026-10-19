package StringClass;

public class Reverse_practice12 {
	public static void main(String args[])
	{
		
		String s1 = new String("Programming");
		System.out.println("String is = "+s1);
		
		
		
		char a[]=s1.toCharArray();
		
		System.out.println("Print the seprate number");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+",");
		}
		
		System.out.println("\nReverse String");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+",");
		}
	}

}
