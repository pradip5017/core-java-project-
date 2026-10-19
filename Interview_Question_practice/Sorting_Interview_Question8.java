package Interview_Question_practice;
import java.util.*;
public class Sorting_Interview_Question8 {
	public static void main(String args[])
	{
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(3,3,"sumit"));
		list.add(new Student (4,2,"pradip"));
		list.add(new Student(3,7,"ram"));
		list.add(new Student (4,1,"Sham"));
		
		Collections.sort(list,(s1, s2)-> {
			if(s1.rank != s2.rank)
			{
				return s1.rank - s2.rank;
			}
			else {
				return s1.name.compareTo(s2.name);
			}
		});
		for(Student s : list)
		{
			System.out.println(s);
		}
		
	}

}
