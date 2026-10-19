package Interview_Question_practice;
import java.util.HashSet;
public class Dublicate_Integer_findOut_Practic10 {
	
	public static void main(String args[])
	{
		int arr[]= {12,21,23,34,56,86,23,56,56};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
	
			for(int n : arr)
			{
				if(!s1.add(n))
				{
					dublicate.add(n);
				}
			}
		System.out.println("Dublicate:"+dublicate);
	}

}
