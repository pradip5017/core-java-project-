package Array;

import java.util.Scanner;

public class Taking_array_from_user_practic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int name;
		
		System.out.println("enter the elemenet");
		name=sc.nextInt();
		
		int a[] = new int[name];
		
		System.out.println("Enter the valued..!!");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
//			System.out.println(a[i]);
		}
		
		System.out.println("Array Elements..");
		
		for(int j=0; j<a.length; j++)
		{
			System.out.println(a[j]);
		}
		
				
	}

}
