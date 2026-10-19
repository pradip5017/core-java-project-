package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray2 {
	public static void main(String[] args) {
		int arr[]= {11,22,33,54,56,656,343,657,856};
		
		Arrays.sort(arr);
		
		int third = arr[arr.length-3];
		System.out.println(third);
	}

}
