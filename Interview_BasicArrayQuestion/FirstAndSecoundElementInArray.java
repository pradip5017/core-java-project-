package Interview_BasicArrayQuestion;

public class FirstAndSecoundElementInArray {
	public static void main(String[] args) {
		
		int arr[]= {2,5,8,6,2,89,1};
		
//		int first =arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >max)
			{
				max = arr[i];
			}
		}
//		System.out.println("First Lowest Values in Array :"+first);
		System.out.println("Secound Largest Number :"+max);
	}

}
