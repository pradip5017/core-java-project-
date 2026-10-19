package Interview_BasicArrayQuestion;
import java.lang.reflect.Array; 
import java.util.*;
public class Find_All_Leader_Elements11 {
	public static void main(String[] args) {
		
		int arr[]= {44,33,23,67,54,46,77};

		int num = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			 if(arr[i]>num)
			 {
				 num = arr[i];
				 System.out.print(num+" ");
			 }
		}
	}
}
