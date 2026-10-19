package Interview_BasicArrayQuestion;

public class MaxAndMinimumElementInArray1 {
	public static void main(String[] args) {
		int arr[]= {11,24,4,6,88,9,4};
//		int min=arr[0];
		int max = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("minimum Element :"+max);
	
	}

}
