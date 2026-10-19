package Interview_Question_practice;

public class Pattern_star3 {
	public static void main(String args[])
	{
		int n=5;
		
		for(int i=0; i<=n; i++)
		{
			for(int space=0; space < n-i; space++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			for(int j=2; i<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
