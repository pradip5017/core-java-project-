package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray7 {
	
	public static void main(String args[])
	{
		int arr[]= {2,49,6,7,2,4,6,77};
		
		Arrays.sort(arr);
		
		int secoundHigh = arr[arr.length-2];
		System.out.println("Secound Highest number:"+secoundHigh);
	}

}
