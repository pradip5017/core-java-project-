package Interview_BasicArrayQuestion;

import java.util.ArrayList;
import java.util.Collections;

class Emp11 implements Comparable<Emp11>
{
	int id;
	String name;
	int salary;
	Emp11(int id, String  name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return "Id :"+id+" name :"+name+" salary :"+salary;			
	}
	public int compareTo(Emp11 that )
	{
		return  this.salary - that.salary;
	}	
}
public class SortingValue_In_Collection3 {
	public static void main(String[] args) {
		
		
		ArrayList<Emp11> list= new ArrayList<>();
		
		list.add(new Emp11(1, "pradip",30000));
		list.add(new Emp11(2, "lakhan", 10000));
		list.add(new Emp11(3,"hrushikesh", 40000));
		list.add(new Emp11(6, "Rahul", 20000));
		
		Collections.sort(list);
		for(Emp11 Emp11 : list)
		{
			System.out.println(Emp11);
		}
		
	}

}
