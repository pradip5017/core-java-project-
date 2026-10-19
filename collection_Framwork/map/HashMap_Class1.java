package collection_Framwork.map;
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
			return "Id :"+id+" name :"+name;
		}
		
		public int compareTo(Student that)
		{
			return this.id-that.id;
		}
	}
public class HashMap_Class1 {

	public static void main(String args[])
	{
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(3,"pradip"));
		list.add(new Student(1,"karan"));
		list.add(new Student(2,"Rahul"));
		
		Collections.sort(list);
	
		for(Student n : list)
		{
			System.out.println(n+ "");
		}
	}

}
