package Array;

import java.util.Scanner;

public class Array_row_and_cols {
	public static void main(String[] args) {
		
				Scanner sc =new Scanner(System.in); //67
				
				int rows,cols; //4
				System.out.println("Enter the no of rows and columns for 2D array : ");//11
				     rows =sc.nextInt(); //3
				     cols=sc.nextInt(); //2   //3x2
				
				int  x[][]=new int[rows][cols];
			
				System.out.println("Enter "+(rows*cols)+" elements : ");
				
				  for(int i=0 ;  i<rows   ;i++)  //rows 0 1 2 3
				   { 
				       for(int j=0 ; j< cols; j++ )   //cols 0 1 2 
				       {
				               x[i][j]=  sc.nextInt();
				       }
			     }    
				      
				    System.out.println("array elemenets :");
				    for(int i=0 ;  i<rows   ;i++)  //rows 0 1 2 3
					   { 
					       for(int j=0 ; j< cols; j++ )   //cols 0 1 2 
					       {
					              System.out.print(x[i][j]+" ");
					              
					       }
					       System.out.println();
				     } 
			}

		

	}

	
