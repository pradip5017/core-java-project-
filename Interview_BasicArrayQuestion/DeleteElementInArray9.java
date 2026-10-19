package Interview_BasicArrayQuestion;
import java.util.*;
public class DeleteElementInArray9 {
	public static void main(String args[])
	{
		int arr[]= {1,3,5,7,8,9,4,2,7,1,4,9};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println("dublicate :"+dublicate);
	}

}
