package Interview_BasicArrayQuestion;

public class AddTwoMatrix {
	public static void main(String[] args) {
		
		int arr1[][]= 
			{
				{2,4},
			    {3,5},
			};
		
		int arr2[][] ={
				{6,1},
			    {7,1},
			};
		
		int arr[][] = new int[2][2];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr.length ; j++)
			{

				arr[i][j] = arr1[i][j] + arr2[i][j];
				
				System.out.print(arr[i][j]+" " );
			}
			System.out.println();
		}					
				
	}

}
