package Interview_Question_practice;
import java.util.*;
public class Secound_Highest_Values4 {

	public static void main(String args[])
	{
		int arr[]= {22,33,45,32,34,34,234,433,543,511};
		
		Arrays.sort(arr);
		
		int secoundHighestValue = arr[arr.length-2];
		System.out.println(secoundHighestValue);
		
	}
}
