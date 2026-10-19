package Array;

public class Creating_Two_Dimentional_Array_practic11 {
	public static void main(String args[])
	{
		int arr [][]= new int [5][5];
		
		arr= new int [][] {
			{22,33,44,55,44},
			{11,22,33,22,33},
			{88,77,66,56,22},
			{44,54,65,44,23},
			{34,54,23,54,54}
			
		};
		System.out.println("Enter Array Elemets..!!");
		for(int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}

}
