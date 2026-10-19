package Interview_BasicArrayQuestion;

import java.util.ArrayList;
import java.util.Collections;

class Emp10 implements Comparable<Emp10>
{
	int id; String name; int salary;
	
	Emp10(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return "Id :" +id+ " name :"+name+" Salary :"+salary;
	}
	
	public int compareTo(Emp10 that)
	{
		return  this.salary - that.salary;
	}
}
public class SortingValue_In_Collection4 {
	public static void main(String[] args) {
		
		ArrayList<Emp10> list = new ArrayList<>();
		list.add(new Emp10(1,"pradip",20000));
		list.add(new Emp10(2,"rahul",10000));
		list.add(new Emp10(3,"Hrushikesh",40000));
		list.add(new Emp10(4,"pavan",5000));
		
		Collections.sort(list);
		for(Emp10 e : list)
		{
			System.out.println(e);
		}
	}

}
