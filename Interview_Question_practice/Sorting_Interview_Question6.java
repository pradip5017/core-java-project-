package Interview_Question_practice;
import java.util.*;
public class Sorting_Interview_Question6 {
	public static void main(String args[])
	{
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student (2,4,"sumit"));
		list.add(new Student (1,2,"Nisha"));
		list.add(new Student (3,7,"Pradip"));
		list.add(new Student (4,6,"Rahul"));
		list.add(new Student (7,4,"sumit"));
		list.add(new Student (3,4,"Amit"));
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student s1 , Student s2)
			{
				if(s1.rank != s2.rank)
				{
					return s1.rank - s2.rank;
				}
				
				else {
					return s1.name.compareTo(s2.name);
					
				}
				
			}
			
		});
		for(Student str : list)
		{
			System.out.println(str);
		}
		
	}

}
