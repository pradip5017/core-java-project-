package Array;

import java.util.Scanner;

public class Array_row_and_cols_practic1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
				
		int row, cols;
		
		System.out.println("Enter The Row And Cols Elements..!!");
		
			row = sc.nextInt();
			cols = sc.nextInt();
			
			
			int x [][]= new int[row][cols];
			
			System.out.println("Enter "+(row*cols)+" Array numbers ");
			
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<cols; j++)
				{
					x[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Array Number Is..");
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<cols; j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
	}

}
