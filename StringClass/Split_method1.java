package StringClass;

public class Split_method1 {
	public static void main(String args[])
	{
		String s1 ="programming Language ";
		
		String arr[]= s1.split(" ");
	
		for(String world : arr)
		{
			String revers="";
			for(int i=world.length()-1; i>=0; i--)
			{
				revers = revers +world.charAt(i);
			}
			System.out.print(revers+" ");
		}
	}
}
