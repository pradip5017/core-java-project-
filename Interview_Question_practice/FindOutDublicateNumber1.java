package Interview_Question_practice;
import java.util.*;
public class FindOutDublicateNumber1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,5,6,5,7,89,3};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("Dublicate :"+dublicate);
	}

}
