package Interview_Question_practice;
import java.util.*;
import java.util.Collections;
import java.util.List;

class Student10 implements Comparable<Student10>
{
	int id;
	String name;
	
	Student10(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}
	
	public int compareTo(Student10 that)
	{
		return this.id - that.id;
	}
	
}
public class Sorting_Interview_Question7 {
	public static void main(String args[])
	{
		List<Student10> list = new ArrayList<>();
		
		list.add(new Student10(5,"pradip"));
		list.add(new Student10(4,"jivan"));
		list.add(new Student10 (2,"karna"));
		list.add(new Student10(1,"vishal"));
		Collections.sort(list);
		
		for(Student10 s1 :list)
		{
			System.out.println(s1);
		}
		
	}

}
