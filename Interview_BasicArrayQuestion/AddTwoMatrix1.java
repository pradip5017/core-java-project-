package Interview_BasicArrayQuestion;
import java.util.*;
public class AddTwoMatrix1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int rows=2;
		int cols=2;
		
		int arr1[][]= new int [rows][cols];
		int arr2[][]= new int[rows][cols];
		int arr[][]= new int [rows][cols];
		
		System.out.println("Enter First Matrix :");
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr1[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("Enter secound  Matrix :");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr2[i][j]= sc.nextInt();
		}
		}
		
		System.out.println("Addtions :");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j]= arr1[i][j]+arr2[i][j];
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
