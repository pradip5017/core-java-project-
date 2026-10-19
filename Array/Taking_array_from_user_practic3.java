package Array;
import java.util.*;
public class Taking_array_from_user_practic3 {
	public static void main(String args[])
	{
		/*
		Scanner sc = new Scanner(System.in);
		
		
		int name;
		
		System.out.println("Enter any Elements");
		
		name = Integer.parseInt(sc.nextLine());
		
		int a []= new int[name];
		System.out.println("Ente array number");
		
		for(int i=0; i<a.length; i++)
		{
			a[i]= Integer.parseInt(sc.nextLine());
		}
				
		System.out.println("Array number is..");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		System.out.println("Enter name");
		
		name =sc.nextLine();
		
		for(int i=0; i<name.length()-1; i++)
		{
			name=name + sc.nextLine();
			System.out.println(name);
		}
	
		
		
	}

}
