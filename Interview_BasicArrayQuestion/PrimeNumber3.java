package Interview_BasicArrayQuestion;

public class PrimeNumber3 {

	public static void main(String[] args) {
		int num = 17;
		
		boolean prime = true;
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				prime = false;
				break;
			}
		}
		if(prime)
		{
			System.out.print(num+" :is Prime");
		}else
		{
			System.out.println(num+" :not prime");
		}
	}
}
