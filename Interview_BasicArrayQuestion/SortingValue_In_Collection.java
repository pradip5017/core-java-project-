package Interview_BasicArrayQuestion;
import java.util.*;

	class Student implements Comparable<Student>
	{
		int id;
		String name;
		int salary;
		
		Student (int id, String name, int salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		public String toString()
		{
			return id+" "+name+" "+salary;
		}

		
		 public int compareTo(Student that)
		 {
			 return this.salary- that.salary;
		 }
	}
public class SortingValue_In_Collection {
	public static void main(String[] args)
	{
		ArrayList<Student> s1= new ArrayList<>();
		
		s1.add(new Student(1,"pradip",20000));
		s1.add(new Student(2,"karna",60000));
		s1.add(new Student(4,"Ambadas",40000));
		s1.add(new Student(5,"Hrushikesh",10000));
		
		Collections.sort(s1);
		
		for(Student num :s1)
		{
			System.out.println(num);
		}	
	}

}
