package Array;

import java.util.Scanner;

public class Taking_array_from_user_practic50 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter Array Elements..!!");
		
		num =Integer.parseInt(sc.nextLine());
		int x []=new int[num];
		
		System.out.println("Enter Array Numbers..!!");
		for(int i=0; i<x.length; i++)
		{
			x[i] =Integer.parseInt(sc.nextLine());
		}
		System.out.println("Array Number  is");
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
		
	}

}
