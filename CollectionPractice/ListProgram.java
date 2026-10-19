package CollectionPractice;
import java.util.*;

class Student
{
	int num ;
	
	Student(int num)
	{
		this.num=num;
	}
}
public class ListProgram {
	public static void main(String args[])
	{
		List <Student> list = new ArrayList<>();
		list.add(new Student(10));
		list.add(new Student(123));
		list.add(new Student(13));
		list.add(new Student(53));
		list.add(new Student(81));
		list.add(new Student(13));
		

		
	
		for(Student n : list)
		{
			if(n.num % 2==0)
			{
				System.out.println("Odd : "+n.num);
			}else
			{
				System.out.println("even :"+n.num);
			}
		}
		
	}

}
