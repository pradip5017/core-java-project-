package Interview_BasicArrayQuestion;

public class FindMaxAndMinElementInArray2 {
	public static void main(String[] args) {
		int arr[]= {11,22,33,46,7,8,43,65,74,23,54};
		
		int min =arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min )
			{
				min = + arr[i];
			}
		
		}
		System.out.println(min);
	}

}
