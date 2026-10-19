package Interview_Question_practice;
import java.util.*;
public class FindOutDublicateNumber {
	
 public static void main(String args[])
 {
	 int arr[]= {1,2,3,4,1,4,5,6,7,53,3,2,12,34};
	 
	 HashSet<Integer> s1 = new HashSet<>();
	 HashSet<Integer> dublicate =new HashSet<>();
	 
	 for(Integer num : arr)
	 {
		 if(!s1.add(num))
		 {
			 dublicate.add(num);
		 }
		 System.out.println(dublicate);
	 }
 }
}
