package Interview_Question_practice;
import java.util.*;
public class Addition_of_array {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		
		int num =0;
		
		for(int i=0; i<arr.length; i++)
		{
			num = num +arr[i];
			
		}
		System.out.println(num);
	}

}
