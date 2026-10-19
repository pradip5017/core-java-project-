package Interview_Question_practice;

public class SumOfEvenNumberOfArray {
	public static void main(String args[])
	{
		int arr1[]= {1,2,3,4,5};
		
		int sum1=0;
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i] % 2==0)
			{
				sum1 +=arr1[i];
			}
		}
		System.out.println("Sum of Even Number :"+sum1);
	}

}
