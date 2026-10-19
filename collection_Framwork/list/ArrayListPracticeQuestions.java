package collection_Framwork.list;
import java.util.*;

public class ArrayListPracticeQuestions {
	public static void main(String args[])
	{
		List<String>s1 = new ArrayList<>();
		
		s1.add("pradip");
		s1.add("jivan");
		s1.add("karan");
		s1.add("lakhan");
		s1.add("Hrushikesh");
		s1.add("Rahul");
		
		System.out.println(s1);
		
		for(String s : s1)
		{
//			if(s.startsWith("p"))
			if(s.endsWith("p"))
			{
				
				System.out.println(s);
			}
		}
		
	}

}
