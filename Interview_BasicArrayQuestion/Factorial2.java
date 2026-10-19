package Interview_BasicArrayQuestion;

public class Factorial2 {
	public static void main(String args[])
	{
		int num = 3;
		int fact =1;
		
		for(int i=0; i<= num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Num :"+num+" Factorical :"+fact);
	}

}
