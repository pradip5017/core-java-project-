package Interview_Question_practice;

public class EvenOddNumber2 {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 ==0)
			{
				System.out.println("This is Even Number :"+arr[i]);
			}else
			{
				System.out.println("This is Odd Number :"+arr[i]);
			}
		}
	}
}
