package Interview_BasicArrayQuestion;

import java.util.ArrayList;
import java.util.Collections;

class StudentClass implements Comparable<StudentClass>{
		int id;
		String name;
		int marks;
		
		StudentClass(int id, String name, int marks)
		{
			this.id=id;
			this.name=name;
			this.marks=marks;
		}
		
		public String toString()
		{
			return "id : "+id+"  name : "+ name+"  marks : "+marks;
		}
		
		public int compareTo(StudentClass that)
		{
			return this.marks - that.marks;
		}
		
		
	}
public class SortingMarksInArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<StudentClass> s1 = new ArrayList<>();
		s1.add(new StudentClass(1,"pradip",40000));
		s1.add(new StudentClass(2,"Hrushikesh", 20000));
		s1.add(new StudentClass(3,"narayan",30000));
		s1.add(new StudentClass(4,"gopal", 10000));
		
		
		Collections.sort(s1);
		for(StudentClass s : s1)
		{
			System.out.println(s);
		}
	}

}
