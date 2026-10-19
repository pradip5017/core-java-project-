package Array;

import java.util.Scanner;

public class Creating_two_dimentional_Array_using_new_Keyword1_practice {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter array Elemetns..!!");
		
		num = sc.nextInt();
		int a[]= new int[num];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter array number..!!");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
