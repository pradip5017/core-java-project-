package StringClass;

public class Reverse {
	public static void main(String[] args) {
		
		//string to array convertion 
		
		
						//     012345678910	
		String s1= new String("Pragramming");
		System.out.println("String= "+s1);
		
		
		char x []= s1.toCharArray(); // String to array convert 
		System.out.println("Charector array");
		
		
		for (int i=0; i<x.length; i++) // 
		{
			System.out.print(x[i]+",");
		}
		
		System.out.println("\nReverse String =");
		for(int i=x.length-1; i>=0; i--)//reverse String in using array 
		{
			System.out.print(x[i]+",");  
		}
		
	}

}
