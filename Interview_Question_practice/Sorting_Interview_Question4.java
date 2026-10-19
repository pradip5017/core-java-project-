package Interview_Question_practice;
import java.util.*;
	 class Employee10
	{
		int rollNumber;
		int rank;
		String name;
		
		Employee10(int rollNumber, int rank, String name)
		{
			this.rollNumber=rollNumber;
			this.rank=rank;
			this.name=name;
					
		}
		public String ToString()
		{
			return  rollNumber +" "+rank+" "+name;
		}
	}
public class Sorting_Interview_Question4 {
	public static void main(String args[])
	{
		 ArrayList<Student> list = new ArrayList<>();
	        list.add(new Student(2, 3, "sumit"));
	        list.add(new Student(1, 4, "shweta"));
	        list.add(new Student(5, 7, "sakshi"));
	        list.add(new Student(3, 2, "Nisha"));
	        list.add(new Student(1, 2, "Mona"));

	        // Sort using Comparator
	        Collections.sort(list, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {
	                if (s1.rank != s2.rank) {
	                    return s1.rank - s2.rank; // sort by rank
	                } else {
	                    return s1.name.compareTo(s2.name); // if rank same, sort by name
	                }
	            }
	        });

	        for (Student s : list) {
	            System.out.println(s);
	        }
	    }
	}