package Interview_BasicArrayQuestion;

public class EvenAndOddNumber6 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6};
		
		for(int i=0; i<arr.length; i++)
		{
			if(i % 2 ==0)
			{
				System.out.println("Even:"+i);
			}
			else
			{
				System.out.println("Odd:"+i);
			}
		}
	}

}
