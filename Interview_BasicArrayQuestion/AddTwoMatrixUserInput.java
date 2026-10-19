package Interview_BasicArrayQuestion;

import java.util.Scanner;

public class AddTwoMatrixUserInput {
	public static void main(String[] args) {
		
		// user input matrix
		Scanner sc = new Scanner(System.in);
		
		int rows =2;
		int cols =2;
		
		int arr1[][]= new int [rows][cols];
		int arr2[][]= new int[rows][cols];
		int arr[][]= new int [rows][cols];
		
		System.out.println("Enter First Matrix :");
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<cols;j++)
			{
				arr1[i][j]= sc.nextInt();
				
			}
		}
		System.out.println("Enter Secound Matrix :");
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<cols;j++)
			{
				arr2[i][j]= sc.nextInt();
				
			}
		}
		System.out.println("Addition of matrix:");
		for(int i=0; i<rows;i++)
		{
			for(int j=0; j<cols;j++)
			{
				arr[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
