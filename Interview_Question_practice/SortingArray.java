package Interview_Question_practice;
import java.util.*;
import java.util.Arrays;
// dublicate remove and sorting array
public class SortingArray {
	public static void main(String[] args) {
		
		int arr[]= {4,5,7,8,3,5,7,1,3};
		
		int result ;
		Arrays.sort(arr);
		
		for(Integer n :arr)
		{
			System.out.print(n+" ");
		}
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer dub :arr)
		{
			if(!s1.add(dub))
			{
				dublicate.add(dub);
			}
		}
		System.out.println("\nSorting And Dublicate Remove :"+s1);
	}

}
