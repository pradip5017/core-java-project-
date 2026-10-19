package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray4 {
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8,4,3,2,445,64,57,34,75,76};
		
		Arrays.sort(arr);
		
		int thirdHigh = arr[arr.length-3];
		System.out.println(thirdHigh);
	}

}
