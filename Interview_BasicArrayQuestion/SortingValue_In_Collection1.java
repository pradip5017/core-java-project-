package Interview_BasicArrayQuestion;
 import java.util.*;
	class Stud  implements Comparable<Stud>
 {
	 int id;
	 String name;
	 int price;
	 
	 Stud(int id, String name, int price)
	 {
		 this.id=id;
		 this.name=name;
		 this.price= price;
	 }
	 
	 public String toString()
	 {
		 return id+" "+name+" "+price;
	 }
	 
	 public int compareTo(Stud that)
	 {
		 return this.price - that.price;
	 }
 }
public class SortingValue_In_Collection1 {
	public static void main(String[] args) 
	{
		ArrayList<Stud> s1 = new ArrayList<>();
		
		s1.add(new Stud(1,"pradip",30000));
		s1.add(new Stud(2,"lakhan",10000));
		s1.add(new Stud(3,"rahul",50000));
		s1.add(new Stud(4,"manoj",20000));
		
		Collections.sort(s1);
		
		for(Stud s:s1)
		{
			System.out.println(s);
		}
		
	}

}
