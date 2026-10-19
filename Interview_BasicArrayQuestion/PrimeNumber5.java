package Interview_BasicArrayQuestion;

public class PrimeNumber5 {
	
	public static void main(String args[])
	{
		int num = 10;
		boolean prime = true;
		
		for(int i=0; i<=num; i++)
		{
			if(num % 2 ==0)
			{
				prime = false;
				break;
			}
		}
		
		if(prime)
		{
			System.out.println("Prime is ="+prime);
		}else
		{
			System.out.println("Not prime ="+prime);
		}
	}

}
