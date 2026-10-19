package Interview_Question_practice;
import java.util.*;
public class Secound_Highest_Values_withSort_Metho5 {
	public static void main(String args[])
	{
		int arr[]= {32,44,45,234,646,75,343,235,46};
		
		Arrays.sort(arr);
		
		int secoundHigh =  arr[arr.length-2];
		System.out.println("Secound High Element :"+secoundHigh);
	}

}
