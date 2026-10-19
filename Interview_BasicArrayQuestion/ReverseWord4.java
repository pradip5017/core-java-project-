package Interview_BasicArrayQuestion;
// revers String world 
public class ReverseWord4 {
	public static void main(String args[])
	{
		String s1 ="Programming Language ";
		
		String arr[]= s1.split(" ");
		
		for(String num : arr)
		{
			String result ="";
			for(int i=num.length()-1; i>=0; i--)
			{
				result = result +num.charAt(i);
				 break;
			}
			System.out.print(result+" ");
		}
		
	}
	

}
