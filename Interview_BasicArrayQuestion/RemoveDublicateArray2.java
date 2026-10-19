package Interview_BasicArrayQuestion;
// remove dublicate Array
import java.util.*;
public class RemoveDublicateArray2 {
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,5,6,8,9,4,3,6,8};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("Remove Dublicate :"+s1);
		System.out.println("Find out Dublicate :"+dublicate);
	}

}
