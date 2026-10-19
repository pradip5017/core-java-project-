package Interview_BasicArrayQuestion;

public class FindMaxAndMinElementInArray3 {
	public static void main(String args[])
	{
		int arr[]= {11,32,4,34,5,23,6,98,44};
//		int max=arr.length;
		int min = arr.length;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min =+ arr[i];
			}
		}
		System.out.println(min);
	}
}
