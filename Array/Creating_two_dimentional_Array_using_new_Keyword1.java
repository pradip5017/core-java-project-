package Array;

import java.util.Scanner;

public class Creating_two_dimentional_Array_using_new_Keyword1 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter Array elements");
		
		num = sc.nextInt();
		
		int x []= new int[num];
		for(int i=0; i<x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		
		System.out.println("Enter Array Number..!!!");
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
	}
}
