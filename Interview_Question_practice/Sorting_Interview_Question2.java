package Interview_Question_practice;
import java.util.Collections;
import java.util.*;

class Emp implements Comparable<Emp>
 {
	 int id;
	 String name;
	 int salary;
	 
	 Emp(int id, String name, int salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 
	 }
	 public String toString()
	 {
		 return id+" "+name+" "+salary;
	 }
	 
	 public int compareTo(Emp that)
	 {
		 return this.id - that.id;
	 }
	 
 }
public class Sorting_Interview_Question2 {
	
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp(2,"pradip",20000));
		list.add(new Emp(3,"vishal",4000));
		list.add(new Emp(1,"karna",2000));
		list.add(new Emp(5,"monu",5000));
		
		Collections.sort(list);
		
		for(Emp e : list)
		{
			System.out.println(e);
		}
		
	}

}
