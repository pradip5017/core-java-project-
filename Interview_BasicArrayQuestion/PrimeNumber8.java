package Interview_BasicArrayQuestion;

public class PrimeNumber8 {
	public static void main(String args[])
	{
		int num = 19;
		
		boolean prime = true;
		for(int i=0; i<=num ; i++)
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
