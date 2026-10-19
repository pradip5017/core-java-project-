package Interview_BasicArrayQuestion;

public class MinValueAndMaxValueArray1 {
	public static void main(String[] args) {
		
		int arr[]= {6,4,7,8,4,2,5,9,2};
		
//		int min = arr[0];
		int max = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =+arr[i];
			}
		}
		System.out.println(max);
	}

}
