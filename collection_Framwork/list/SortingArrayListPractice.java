package collection_Framwork.list;
import java.util.*;

class Students implements Comparable<Students>
{
    int id;
    String name;
    
    Students(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    // Correct method name (Java is case-sensitive)
    public String toString()
    {
        return id + " " + name;
    }
    
    // Compare by id
    public int compareTo(Students that)
    {
        return this.id - that.id;
    }
}

public class SortingArrayListPractice {
    public static void main(String args[])
    {
        List<Students> list = new ArrayList<>();
        list.add(new Students(3,"Pradip"));
        list.add(new Students(4,"Karna"));
        list.add(new Students(1,"Vishal"));
        list.add(new Students(8,"Rahul"));
        list.add(new Students(2,"Jivan"));
        
     
        Collections.sort(list);
        
        // Print sorted list
        for(Students s : list) {
            System.out.println(s);
        }
    }
}
