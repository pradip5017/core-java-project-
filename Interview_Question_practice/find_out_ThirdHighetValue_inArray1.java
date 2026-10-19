package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray1 {
	public static void main(String args[])
	{
		int arr[]= {2,34,64,756,886,23,65,878,434,235,777,232};
		
		Arrays.sort(arr);
		
		int thirdElement = arr[arr.length-3];
		System.out.println(thirdElement);
	}

}
