package Array;

import java.util.Scanner;

public class Taking_array_from_user_practic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int name;
		
		System.out.println("Enter array elements :");
		
		name =Integer.parseInt(sc.nextLine());
		
		int a []= new int[name];  //declaration 
		
		System.out.println("Enter the Number :");
		
		for(int i=0; i<a.length; i++) 
		{
			a[i] =Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Your number is:");
		
		for(int i=0; i<a.length; i++)
		{
			
			System.out.println(a[i]);
		}
		
	}

}
