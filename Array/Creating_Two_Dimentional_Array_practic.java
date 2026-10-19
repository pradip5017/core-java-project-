package Array;

public class Creating_Two_Dimentional_Array_practic {
public static void main(String[] args) {
	
	int x [][]= new int [5][4];
	
	
	 x= new int [][]  
			{
		
		{21,45,65,76},
		{65,67,76,65},
		{65,76,87,65},
		{65,76,87,65},
		{65,76,87,65}
		
	};
		
		System.out.println("Enter the number of two - array");
		
		for(int i=0; i<5; i++ )
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(x[i][j]+",");
			}
			System.out.println();
		}
			
	
}
}
