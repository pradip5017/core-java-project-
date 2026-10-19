package Interview_BasicArrayQuestion;

public class PrimeNumber2 {
	public static void main(String[] args) {
		
		int num= 17;
		
		boolean prime = true;
		
		for(int i=2; i<num; i++)
		{
			if(num % i ==0)
			{
				prime = false;
				break;
			}
		}
		if(prime)
		{
			System.out.print(" Prime number : "+num);
		}
		else
		{
			System.out.println("Not prime :"+num);
		}
	}

}
