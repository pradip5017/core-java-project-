package Interview_BasicArrayQuestion;
// Remove Dublicate element in Array Like = 2,5,6 is remove 
import java.util.*;
public class RemoveDublicateElementInArray {

	public static void main(String[] args) {
		int arr[]= {2,3,5,6,8,6,4,3,5,6};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		
		System.out.println("Remove Dublicate element: "+s1);
	}
}
