package collection_Framwork;
import java.util.*;
public class Test2 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> s1 = new ArrayList<>();
		
		s1.add(22);
		s1.add(20);
		s1.add(24);
		s1.add(25);
		s1.add(28);
		s1.add(27);
		
		System.out.println(s1);
		
		  // Logic to find the largest value and its index
        int max = s1.get(0);
        int maxIndex = 0;

        for (int i = 1; i < s1.size(); i++) {
            if (s1.get(i) > max) {
                max = s1.get(i);
                maxIndex = i;
            }
        }

        System.out.println("Largest Value: " + max);
        System.out.println("Index of Largest Value: " + maxIndex);
	}

}
