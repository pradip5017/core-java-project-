	package Array;
	//1D Array => is a collection of multiple elements of same type
	//2D array  => is a collection of multiple 1D arrays
	//or 2D array is also called as Array of arrays
	//in 2D array elements are stored in the form of rows and columns

public class Creating_Two_Dimentional_Array {
	public static void main(String[] args) {
		
	
		int x [ ] []= {
				
				{43, 56, 76},
				{44, 67, 76},
				{65, 76, 98},
				{45, 76, 87}
		};
				System.out.println("Size of two- Dimention array"+x.length);
				
		
		System.out.println("Access Single element of array");
//		System.out.println(x[0][1]);
		
//		System.out.println(x[3][2]);
		
		System.out.println("Access All element of array");
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(x[i][j]+" ");	
			}
			System.out.println();
		}
	}

}
