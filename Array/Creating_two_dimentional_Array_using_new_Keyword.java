package Array;

public class Creating_two_dimentional_Array_using_new_Keyword {
	public static void main(String[] args) {
		
		int x [][]= new int[2][4] ;   //declation 
		
		x= new int[][] //inilizations
				{
						{34, 65, 76,76},
						{65, 76,87, 99}
				};
				
				System.out.println("Array element"+x.length);
				
				System.out.println("Access is two array");
				
				for(int i=0; i<2; i++)  //row 
				{
					for(int j=0; j<4; j++) //col
					{
						System.out.print(x[i][j]+" ");
					}
					System.out.println();
				}
			
			
			
		
	}

}
