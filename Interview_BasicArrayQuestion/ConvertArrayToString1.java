package Interview_BasicArrayQuestion;

import java.util.ArrayList;

public class ConvertArrayToString1 {
	public static void main(String args[])
	{
		ArrayList<String> s1 = new ArrayList<>();

		s1.add("p");
		s1.add("r");
		s1.add("a");
		s1.add("d");
		s1.add("i");
		s1.add("p");
		
		String s[] = new String [s1.size()];
		
		s.toString();
		for(String n : s1)
		{
			System.out.print(n+" ");
		}
		
	}

}
