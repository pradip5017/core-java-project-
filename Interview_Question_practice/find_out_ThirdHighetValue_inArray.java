package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray {
	public static void main(String args[])
	{
		int arr[]= {1,22,33,55,643,23,566,956,264};
		
		Arrays.sort(arr);
		int thirdHighestValues = arr[arr.length-3];
		System.out.println(thirdHighestValues);
	}

}
