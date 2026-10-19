package Array;

//Jagged_Array is special type of 2D array in which we have different number of columns for each row
public class Jagged_array {
	
	public static void main(String[] args) {
		
int x [][]= new int[2][4] ;   //declation 
		
		x= new int[][] //inilizations
				{
						{34, 65, 76,76},
						{65, 76,87},
						{34, 65, },
						{65, 76,87, 99},
						{34,}
					
				};
				
//				System.out.println("Array element"+x.length);
				
				System.out.println("Access is two-Dimentional Array");
				
				for(int i=0; i<x.length; i++)  //row 
				{
					for(int j=0; j<x[i].length; j++) //col
					{
						System.out.print(x[i][j]+" ");
					}
					System.out.println();
				}

	}

}
