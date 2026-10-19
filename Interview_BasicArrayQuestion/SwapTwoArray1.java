package Interview_BasicArrayQuestion;

public class SwapTwoArray1 {
	public static void main(String args[])
	{
		int a[]= {1,2,8,3,4,5,6};
		int b[]= {9,8,7,6,5,4};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		
	}

}
