package Interview_BasicArrayQuestion;

public class FactorialQuesion3 {
	public static void main(String args[])
	{
		int num = 20;
		int fact = 1;
		
		for(int i=0; i<num; i++)
		{
			fact = fact* i;
		}
		System.out.println("Factorial "+num+" fact "+fact);
	}

}
