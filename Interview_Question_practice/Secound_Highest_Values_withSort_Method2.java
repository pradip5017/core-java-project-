package Interview_Question_practice;
import java.util.*;
public class Secound_Highest_Values_withSort_Method2 {
	public static void main(String args[])
	{
		int arr[] = {2,3,4,5,6,74,56,355,345,325,444};
		
		Arrays.sort(arr);
		
		int secoundHigherstvalue = arr[arr.length-2];
		System.out.println(secoundHigherstvalue);
	}

}
