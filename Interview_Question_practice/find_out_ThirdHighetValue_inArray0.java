package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray0 {
	public static void main(String args[])
	{
		int arr[]= {11,22,4,67,87,56,34};
		
		Arrays.sort(arr);
		int third = arr[arr.length-3];
		System.out.println("Third Highest :"+third);
	}

}
