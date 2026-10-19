package Interview_BasicArrayQuestion;

import java.util.ArrayList;
import java.util.Collections;

class Stud0 implements Comparable<Stud0>
{
	int id;
	String name;
	int salary;
	
	Stud0(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int compareTo(Stud0 that)
	{
		return this.salary - that.salary;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
	
	
}
public class SortingValue_In_Collection2 {

	public static void main(String[] args) {
		
		ArrayList<Stud0> s1 = new ArrayList<>();
		
		s1.add(new Stud0(1,"pradip",3000));
		s1.add(new Stud0(2,"praving",2000));
		s1.add(new Stud0(3,"mohan",1000));
		
		Collections.sort(s1);
		
		for(Stud0 s: s1)
		{
			System.out.println(s);
		}
	}
	
}
