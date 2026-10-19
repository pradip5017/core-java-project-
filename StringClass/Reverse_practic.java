package StringClass;

public class Reverse_practic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("Pradip Rathod");
		System.out.println("String = "+s1);
		
		
		char x []= s1.toCharArray();
		System.out.println("String array"); //string to array convert 
		for(int i=0; i<x.length; i++)
		{
			System.out.print(x[i]);
		}
		
		
		System.out.println("Reverse String to array convert");
		for(int i=x.length-1; i>=0; i--)
		{
			System.out.print(x[i]);//revers string to convert array[];
		}
		System.out.println();
			

	}

}
