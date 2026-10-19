package Interview_Question_practice;

public class SumOfEvenNumberOfArray1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int num =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2==0)
			{
				num +=arr[i];
			}

		}
		System.out.println("Sum of Even Number : "+num);
	}

}
