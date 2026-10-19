package Interview_Question_practice;

public class Multiplication_Questio_in_Array8 {
	public static void main(String args[])
	{
	String str = "piejfisdfsdhjakshd";
	
		int arr[]= new int[222];
	
		for(int i=0; i<str.length(); i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max =-1;
		char c =' ';
		for(int i=0; i<str.length(); i++)
		{
			if(max < arr[str.charAt(i)])
			{
			max = arr[str.charAt(i)];
			
			c=str.charAt(i);
		}
		}
	System.out.println("Multiple Char :"+c);
	System.out.println("Maximum :"+max);
	}

}
