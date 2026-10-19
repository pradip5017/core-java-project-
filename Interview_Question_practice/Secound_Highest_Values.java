package Interview_Question_practice;
import java.util.*;
public class Secound_Highest_Values {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,55,33,22,4,333,44,55,66,33,22,5,466,75};
		
		Arrays.sort(arr);
		
		int secoundHighest = arr[arr.length-2];
		
		System.out.println("Secound highest ="+secoundHighest);
	}

}
