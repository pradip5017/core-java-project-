package Array;

import java.util.Scanner; 

import javax.lang.model.util.Elements;

public class Array_row_and_cols_practic {
	public static void main (String args[])
	{
			Scanner sc = new Scanner(System.in);
			
			int row, cols;
			
			System.out.println("Enter Elements the Row And column..!!");
			
			row = sc.nextInt();
			cols = sc.nextInt();
			
			int x [][]= new int[row][cols];
			
			System.out.println(" Enter "+(row*cols)+" Elements..!!");
			
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<cols; j++)
				{
					x[i][j]= sc.nextInt();
				}
			}
		
			System.out.println("Enter  Elements.!!");
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
