package Interview_BasicArrayQuestion;
//Print a number triangle:
public class Number_triangle {
	public static void main(String args[])
	{
		int n =5;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
				
	}

}
