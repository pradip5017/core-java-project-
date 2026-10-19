package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray3 {
	public static void main(String args[])
	{
		int arr[]= {2,3,7,9,3,5,7,3,8,1,856,23,343,64,8};
		
		Arrays.sort(arr);
		
		int third = arr[arr.length-3];
		System.out.println(third);
	}

}
