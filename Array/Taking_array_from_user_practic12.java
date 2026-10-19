package Array;

import java.util.Scanner;

public class Taking_array_from_user_practic12 {
	
	public static void main(String args[])
	{
		
		//talking array for Users..!!
		
		Scanner sc = new Scanner(System.in);
		int size =2;
		
		System.out.println("Enter Array Elements..!!");
		
		size =sc.nextInt();
		
		int a []= new int[size];
		
		System.out.println("Enter Array Number..!!");
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Array number is = ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]*size); //addition is Array of elements
		}
	}

}
