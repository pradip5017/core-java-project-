package Interview_Question_practice;
import java.util.*;
	class Student1 
	{
		int rollNumber;
		int rank;
		String name;
		
		 public Student1(int rollNumber, int rank, String name)
		 {
			 this.rollNumber=rollNumber;
			 this.rank=rank;
			 this.name= name;
		 }
		 public String  ToString()
		 {
			 return  rollNumber +" "+rank +" "+name;
		 }
	}
public class Sorting_Interview_Question1 {
	public static void main(String args[])
	{
		ArrayList<Student1> str = new ArrayList<>();
		
		str.add(new Student1 (1,3,"sumit"));
		str.add(new Student1 (2,5,"anil"));
		str.add(new Student1 (5,4,"karna"));
		
		Collections.sort(str,(s1, s2) -> {
			if(s1.rank != s2.rank)
				return s1.rank - s2.rank;
			else 
				return s1.name.compareTo(s2.name);
		});
		
		for(Student1 s : str)
		{
			System.out.println(s);
		}
		
	}

}
