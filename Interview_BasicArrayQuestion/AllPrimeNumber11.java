package Interview_BasicArrayQuestion;

public class AllPrimeNumber11 {
	public static void main(String args[])
	{
		
		int limit = 100;
		
		for(int  num=2; num <=limit; num++ )
		{
			boolean isprime = true;
			
			for(int i=2; i<num; i++)
			{
				if(num % i ==0)
				{
					isprime = false;
					break;
				}
			}
			if(isprime)
			{
				System.out.print(num+" ");
			}
		}
		
}
}
