package Interview_BasicArrayQuestion;
import java.util.*;
// find out dublicate Element in Array like = [3, 5, 6, 8]
public class DublicateElementInArray {

	public static void main(String[] args) {
		int arr[]= {2,8,3,5,6,3,5,6,8,6,3};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		
		System.out.println(dublicate);
	}
}
