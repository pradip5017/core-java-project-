package Interview_BasicArrayQuestion;
import java.util.*;
public class DublicateElementCount1 {
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,7,8,34,6,3,2,5,7,3,6};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println("Dublicate :"+dublicate);// dublicate
		System.out.println("Non Dublicate :"+s1);
	}

}
