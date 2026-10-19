package Interview_Question_practice;

public class Smalest_Array_Number9 {
	public static void main(String args[])
	{
		int arr[]= {181,92,73,74,85,65,347,68,79};
		
//		int small =arr[0];
		int max =arr[0];
		for(int i=0; i<arr.length; i++) {
			
			if( arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
