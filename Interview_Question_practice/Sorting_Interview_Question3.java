package Interview_Question_practice;
import java.util.*;
public class Sorting_Interview_Question3 {
	public static void main(String args[])
	{
		ArrayList<Student> std = new ArrayList<>();
		
		std.add(new Student(3,4,"sumit"));
		std.add(new Student(5,2,"amit"));
		std.add(new Student(5,3,"sumit"));
		std.add(new Student(2,5,"amit"));
		std.add(new Student(8,1,"sumit"));
		std.add(new Student(4,2,"amit"));
		
		Collections.sort(std,(s1, s2)-> {
			if(s1.rank != s2.rank)
			{
				return s1.rank - s2.rank;
			}else
			{
				return s1.name.compareTo(s2.name);
			}
		});
		
		for(Student s : std)
		{
			System.out.println(s);
		}
	}

}
