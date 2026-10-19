package Array;

public class Two_D_Array_Practice {
	public static void main (String args[])
	{
		
	 int a [][]= new int [5][4];
	 
	 a= new int [][] 
			 {
		 {23,43,35,27,},
		 {33,51,72,82,},
		 {43,55,23,24,},
		 {21,41,52,72,},
		 {53,47,38,24,}
	 
		 
	 };
	 
	 System.out.println("find the array elements of two array");
	 
	 for(int i=0; i<5; i++)
	 {
		 for(int j=0; j<4; j++)
		 {
			 System.out.print(a[i][j]+",");
		 }
		 System.out.println();
	 }
	 
	
	}
		
}
