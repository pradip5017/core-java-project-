package Interview_BasicArrayQuestion;

import java.awt.SecondaryLoop;
import java.util.Arrays;

public class SecoundHighnumberInSorting {

	public static void main(String[] args) {
		int arr[]= {3,5,61,2,3,5,7,91,5};
		
		Arrays.sort(arr);
		
		int secounHigh = arr[arr.length-2];
		
		System.out.println(secounHigh);
	}
}
