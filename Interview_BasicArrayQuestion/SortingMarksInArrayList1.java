package Interview_BasicArrayQuestion;
import java.util.*;
 class Hrushikesh implements Comparable<Hrushikesh>
 {
	 int id;
	 String name;
	 double salary;
	 
	 Hrushikesh(int id, String name, double salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	 
	  public String toString()
	 {
		 return "Id :"+id+" name :"+name+" salary :"+salary;
	 }
	  
	  public int  compareTo(Hrushikesh that)
	  {
		  return  (int)  (this.salary - that.salary);
	  }
 }
public class SortingMarksInArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<Hrushikesh> list = new ArrayList<>();
		list.add(new Hrushikesh(1,"pradip",30000));
		list.add(new Hrushikesh(2,"hrushikesh",50000));
		list.add(new Hrushikesh(3,"Rahul",20000));
		list.add(new Hrushikesh(4,"Ambadas",10000));
		
		Collections.sort(list);
		
		for(Hrushikesh h : list)
		{
			System.out.println(h);
		}
		
	}

}
