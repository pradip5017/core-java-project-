package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practic9 {

	public static void main(String args[])
	{
		
	int arr[]= {1,2,4,7,8,3,4,6,7};
	
	 HashSet<Integer> s1 = new HashSet<>();
	 HashSet<Integer> dublicate = new HashSet<>();
	 
	 for(int num : arr)
	 {
		 if(!s1.add(num))
		 {
			 dublicate.add(num);
		 }
	 }
	 System.out.println("Dublicate :"+dublicate);
	 
}
}
