package Interview_Question_practice;
import java.util.*;

public class DublicateInteger_number {
	public static void main(String args[])
	{
		
		int arr[]= {1,3,4,5,6,7,8,5,53,3,4,5,6,2,2,4,5,4,9,9,0,0};
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> dublicate = new HashSet<>();
		
		for(Integer str :arr)
		{
			if(!s1.add(str))
			{
				dublicate.add(str);
			}
		}
		System.out.println(dublicate);
		
	}

}


 
