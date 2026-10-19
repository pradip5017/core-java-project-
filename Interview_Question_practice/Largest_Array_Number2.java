package Interview_Question_practice;

public class Largest_Array_Number2 {
	public static void main(String[] args) {
		int arr[]= {12,31,14,6,23,5,76,34,4,35};
		
		int small =arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < small)
			{
				small = arr[i];
			}
		}
		System.out.println(small);
	}

}
