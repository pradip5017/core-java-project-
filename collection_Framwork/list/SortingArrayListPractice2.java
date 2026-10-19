package collection_Framwork.list;

import java.util.*;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public String toString()
	{
		return id+" "+name;
	}
	
	public int compareTo(Employee that)
	{
		return this.id -that.id;
	}
	
}
public class SortingArrayListPractice2 {
	public static void main(String args[])
	{
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(10,"pradip"));
		list.add(new Employee(4,"Rathod"));
		list.add(new Employee(3,"karna"));
		list.add(new Employee(9,"lakhan"));
		list.add(new Employee(2,"nitin"));
		
		Collections.sort(list);
		
		for(Employee emp :list)
		{
			System.out.println(emp);
		}
	}

}
