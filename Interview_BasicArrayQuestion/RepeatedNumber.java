package Interview_BasicArrayQuestion;
import java.util.*;
//Find duplicate elements in an array
//Remove duplicate elements from an array.
public class RepeatedNumber {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,4,2,2,3,7,8,2,4,5};
		
		HashSet<Integer> s1= new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer num :arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("Dublicate Array :"+dublicate);
		System.out.println("Remove Dublicate Element of array:"+s1);
	}

}
