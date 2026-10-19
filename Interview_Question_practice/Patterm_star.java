package Interview_Question_practice;

public class Patterm_star {
	
	public static void main(String args[])
	{
		
		int n=5;
		for (int i=0; i<=n; i++)
		{
			for(int j=0; j<=i; j++ )
//				for(int j=0; j<=n-i-1; j++ ) // Replace pattern 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
