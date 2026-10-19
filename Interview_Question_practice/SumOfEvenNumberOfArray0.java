package Interview_Question_practice;
// even Odd number practice 
public class SumOfEvenNumberOfArray0 {
	public static void main(String args[])
	{
//		int arr[]= {1,4,5,7,9,0,3,5};
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]%2==0)
//			{
//				System.out.println("Positive :"+arr[i]);
//			}
//			else
//			{
//				System.out.println("Negative:"+arr[i]);
//			}
//		}
		
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Event :"+arr[i]);
			}
			else {
				System.out.println("Odd :"+arr[i]);
			}
		}
		
	
	}

}
