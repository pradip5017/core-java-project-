package collection_Framwork.list;
import java.util.*;

	class Student implements Comparable<Student>
	{
		int id;
		String name;
		
		Student(int id, String name)
		{
			this.id=id;
			this.name=name;
			
		}
		
		public String toString()
		{
			return id +" "+name;
		}
		
		public int compareTo(Student that)
		{
			return this.id - that.id;
		}
		
		
	}
	
public class SortingArrayListPractice1 {

	public static void main(String args[])
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(10,"pradip"));
		list.add(new Student (3,"vishla"));
		list.add(new Student(5,"karan"));
		list.add(new Student(2,"priya"));
		
		Collections.sort(list);
		
		for(Student s :list)
		{
			System.out.println(s);
		}
		
	}
	
	
}
