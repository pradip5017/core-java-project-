package Interview_BasicArrayQuestion;

import java.util.ArrayList;

public class ConvertArrayToString {
	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<>();
		
		s1.add("p");
		s1.add("r");
		s1.add("a");
		s1.add("d");
		s1.add("i");
		s1.add("p");
		
		String arr[] = new String[s1.size()];
		
		arr.toString();
		
		for(String s : s1)
		{
			System.out.print(s+" ");
		}
		
		
		
	}

}
