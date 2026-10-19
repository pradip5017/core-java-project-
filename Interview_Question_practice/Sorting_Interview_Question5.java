package Interview_Question_practice;
	import java.util.*;
	class Student01{
		int rollNumber;
		int rank;
		String name;
		
		Student01(int rollNumber, int rank, String name)
		{
			this.rollNumber=rollNumber;
			this.rank=rank;
			this.name=name;
		}
		public String ToString()
		{
			return rollNumber+" "+rank+" "+name;
		}
		
	}
public class Sorting_Interview_Question5 {
	public static void main(String args[])
	{
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1,3,"Swata"));
		list.add(new Student(4,3,"pradip"));
		list.add(new Student(3,1,"Ram"));
		list.add(new Student(4,2,"Nitin"));
		list.add(new Student(5,7,"Mona"));
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student s1, Student s2)
			{
				if(s1.rank != s2.rank)
				{
					return s1.rank - s2.rank;
					
				}else {
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



