package Interview_BasicArrayQuestion;
import java.util.*;
public class RemoveDublicateArray4 {
	public static void main(String[] args) {
		int arr[]= {1,2,5,4,2,4,7,8,6,4,3,5};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println("Remove Dublicate :"+s1);
		System.out.println("Dublicate :"+dublicate);
	}

}
