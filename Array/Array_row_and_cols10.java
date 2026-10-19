package Array;

import java.util.Scanner;

public class Array_row_and_cols10 {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int row, cols;
		
		System.out.println("Enter Array Elements..!!");
		row= sc.nextInt();
		cols=sc.nextInt();
		
		int arr[][]= new int [row][cols];
		
		System.out.println("The Array Enter "+(row*cols)+" elements ");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j]= sc.nextInt();
			}
		
		}
		
		System.out.println("Enter array Elements..!!");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
