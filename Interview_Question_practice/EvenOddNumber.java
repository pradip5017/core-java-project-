package Interview_Question_practice;

public class EvenOddNumber {
	public static void main(String args[])
	{
		
		int arr[]= {1,2,3,4,5,6,7,8};
		
		int num =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] %2==0)
			{
				num += arr[i];
				System.out.println("Even Number:"+arr[i]);
			}
			else {
				System.out.println("Odd Number :"+arr[i]);
			}
		}
		System.out.println("Even Number Addtion:"+num);
	}

}
