package Interview_BasicArrayQuestion;

public class PrimeNumber7 {
	
	public static void main(String args[])
	{
		int num = 17;
		boolean prime = true;
		
		for(int i=2; i<=num; i++)
		{
			if(num % 2 ==0)
			{
				prime = false;
				break;
			}
		}
		
		if(prime)
		{
			System.out.println("This is prime :"+num);
		}
		else
		{
			System.out.println("This is not prime :"+num);
		}
	}

}
