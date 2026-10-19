package Interview_BasicArrayQuestion;

public class EvenAndOddNumber5 {
	public static void main(String args[])
	{
		int arr = 100;
		
		for(int i=0; i<=arr; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even :"+i);
			}
			else
			{
				System.out.println("Odd:"+i);
			}
		}
	}

}
