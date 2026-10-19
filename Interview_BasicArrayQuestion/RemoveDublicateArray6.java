package Interview_BasicArrayQuestion;
import java.util.*;

//find out dublicate element 
public class RemoveDublicateArray6 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,6,7,8,9,4,5,7,8,9};
		
		HashSet<Integer> s1= new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("Original Element :"+s1+" ");// remove Dubicate 
		System.out.println("Dublicate Element :"+dublicate+" ");// pring dublicate
		
	}

}
